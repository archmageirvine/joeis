package irvine.math.wolfram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.util.Point;
import irvine.util.Triple;
import irvine.util.array.LongDynamicByteArray;

/**
 * Construct and run Turing machines as used in the writings of Stephen Wolfram.
 * @author Sean A. Irvine
 */
public class TuringMachine {

  // Maps (state,symbol) -> (state,symbol,direction)
  private final Map<Point, Triple<Integer>> mRules = new HashMap<>();
  private final int mSymbols;
  private LongDynamicByteArray mTape = new LongDynamicByteArray();
  private long mPosition = 0;
  private int mState = 1;

  /**
   * Construct a Turing machine
   * @param machineNumber Wolfram machine number
   * @param states number of states
   * @param symbols number of symbols
   */
  public TuringMachine(final int machineNumber, final int states, final int symbols) {
    mSymbols = symbols;
    // Reverse engineered from description on p. 888 of ANKOS

    // Step 1: digits = Reverse[IntegerDigits[machineNumber, 8, 4]] (LSB first)
    final List<Integer> digits = new ArrayList<>();
    final int mod = 2 * states * symbols;
    for (int i = 0, m = machineNumber; i < states * symbols; ++i) {
      digits.add(m % mod);
      m /= mod;
    }

    // Step 2: Partition digits into rows of length symbols
    final List<List<Integer>> partitioned = new ArrayList<>();
    for (int i = 0; i < digits.size(); i += symbols) {
      partitioned.add(digits.subList(i, i + symbols));
    }

    // Step 3: MapIndexed over level 2
    for (int r = 0; r < partitioned.size(); ++r) {
      final List<Integer> row = partitioned.get(r);
      for (int c = 0; c < row.size(); ++c) {
        final int val = row.get(c);
        // Correct LHS: state = states + 1 - (r+1), read = 0-based
        final int state = states + 1 - (r + 1);
        // Compute RHS
        final int q1 = val / (2 * symbols);
        final int q2 = (val >>> 1) % symbols;
        final int q3 = val & 1; // move head left or right
        mRules.put(new Point(state, c), new Triple<>(q1 + 1, q2, 2 * q3 - 1));
      }
    }
  }

  /**
   * Construct the specified machine in Wolfram's numbering.
   * @param machineNumber machine number
   */
  public TuringMachine(final int machineNumber) {
    this(machineNumber, 2, 2);
  }

  /**
   * Initialize the tape to the given value
   * (treated as a number in the base equal to the number of symbols).
   * @param n initializer
   */
  public void initialTape(final long n) {
    mTape = new LongDynamicByteArray();
    long m = n;
    long k = 0;
    while (m != 0) {
      mTape.set(k, (byte) (m % mSymbols));
      ++k;
      m /= mSymbols;
    }
    mPosition = 0;
    mState = 1;
  }

  /**
   * Perform a single step of computation.
   * @return position on tape after the step
   */
  public long step() {
    final Triple<Integer> action = mRules.get(new Point(mState, mTape.get(mPosition)));
    mTape.set(mPosition, action.mid().byteValue());
    mState = action.left();
    mPosition -= action.right();
    return mPosition;
  }

  /**
   * Return the current contents of the tape as an integer.
   * @return tape value
   */
  public Z readTape() {
    Z res = Z.ZERO;
    for (long k = mTape.length() - 1; k >= 0; --k) {
      res = res.multiply(mSymbols);
      res = res.add(mTape.get(k));
    }
    return res;
  }

  /**
   * Check if this Turing machine never halts because it only ever moves left.
   * Machines might, of course, also fail to halt only for some inputs or for
   * other reasons not tested here.
   * @return true if the machine provably never halts
   */
  public boolean neverHalts() {
    for (final Triple<Integer> t : mRules.values()) {
      if (t.right() > 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * Run a particular machine.
   * @param args machine-number states symbols tape
   */
  public static void main(final String[] args) {
    final int machine = Integer.parseInt(args[0]);
    final int states = Integer.parseInt(args[1]);
    final int symbols = Integer.parseInt(args[2]);
    final long tape = Long.parseLong(args[3]);
    final long max = args.length > 4 ? Long.parseLong(args[4]) : Long.MAX_VALUE;
    final TuringMachine tm = new TuringMachine(machine, states, symbols);
    System.out.println(tm.mRules);
    tm.initialTape(tape);
    long runtime = 0;
    while (true) {
      System.out.println(tm.mState + " " + tm.mPosition + " " + tm.readTape().toString(symbols));
      if (++runtime > max) {
        System.out.println("Computation aborted");
        return;
      }
      if (tm.step() < 0) {
        System.out.println("Total runtime: " + runtime + " output: " + tm.readTape().toString(symbols));
        return;
      }
    }
  }
}

