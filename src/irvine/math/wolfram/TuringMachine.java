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

  // Maps (state,symbol) -> (state,symbols,direction)
  private final Map<Point, Triple<Integer>> mRules = new HashMap<>();
  private LongDynamicByteArray mTape = new LongDynamicByteArray();
  private long mPosition = 0;
  private int mState = 1;

  // Untested for states and symbols != 2
  private TuringMachine(final int machineNumber, final int states, final int symbols) {
    // Reverse engineered from description on p. 888 of ANKOS

    // Step 1: digits = Reverse[IntegerDigits[machineNumber, 8, 4]] (LSB first)
    final List<Integer> digits = new ArrayList<>();
    for (int i = 0, temp = machineNumber; i < states * symbols; i++) {
      digits.add(temp & 7);
      temp >>>= 3;
    }

    // Step 2: Partition digits into rows of length symbols
    final List<List<Integer>> partitioned = new ArrayList<>();
    for (int i = 0; i < digits.size(); i += symbols) {
      partitioned.add(digits.subList(i, i + symbols));
    }

    // Step 3: MapIndexed over level 2
    for (int r = 0; r < partitioned.size(); r++) {
      final List<Integer> row = partitioned.get(r);
      for (int c = 0; c < row.size(); c++) {
        final int val = row.get(c);
        // Correct LHS: state = states + 1 - (r+1), read = 0-based
        final int state = states + 1 - (r + 1);
        // Compute RHS
        final int q1 = (val >>> 2) & 1;
        final int q2 = (val >>> 1) & 1;
        final int q3 = val & 1;
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
   * Initialize the tape to the given value (treated as binary).
   * @param n binary initializer
   */
  public void initialTape(final long n) {
    mTape = new LongDynamicByteArray();
    long m = n;
    long k = 0;
    while (m != 0) {
      mTape.set(k, (byte) (m & 1));
      ++k;
      m >>>= 1;
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
      res = res.multiply2();
      res = res.add(mTape.get(k));
    }
    return res;
  }

  /**
   * Run a particular machine.
   * @param args machine-number tape
   */
  public static void main(final String[] args) {
    final int machine = Integer.parseInt(args[0]);
    final long tape = Long.parseLong(args[1]);
    final TuringMachine tm = new TuringMachine(machine);
    System.out.println(tm.mRules);
    tm.initialTape(tape);
    long runtime = 0;
    while (true) {
      System.out.println(tm.mState + " " + tm.mPosition + " " + tm.readTape().toString(2));
      ++runtime;
      if (tm.step() < 0) {
        System.out.println("Total runtime: " + runtime);
        return;
      }
    }
  }
}

