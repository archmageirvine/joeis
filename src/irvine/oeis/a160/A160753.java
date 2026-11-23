package irvine.oeis.a160;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A160753 Binary expansion of the Chaitin halting probability Omega_L for a certain programming language L.
 * @author Gregory Morse
 */
public class A160753 extends Sequence0 {

  private static final int BITS = 40;
  private static final int CODE_CAP = 15;
  private static final int REGISTERS = 8;
  private static final int STATE_CAP = 64;
  private static final int HALT = -1;
  private static final int REJECT = -2;
  private static final int OPEN = -3;

  private static final class Instruction {
    private final char mOp;
    private final int mReg;
    private final int mValue;
    private final boolean mConstant;
    private final int mTarget;
    private final int mLength;
    private final int mRegisters;

    private Instruction(final char op, final int reg, final int value, final boolean constant, final int target, final int length, final int registers) {
      mOp = op;
      mReg = reg;
      mValue = value;
      mConstant = constant;
      mTarget = target;
      mLength = length;
      mRegisters = registers;
    }
  }

  private static final class State {
    private final int mPc;
    private final BigInteger[] mRegisters;

    private State(final int pc, final BigInteger[] registers) {
      mPc = pc;
      mRegisters = registers;
    }

    @Override
    public int hashCode() {
      return 31 * mPc + Arrays.hashCode(mRegisters);
    }

    @Override
    public boolean equals(final Object other) {
      if (!(other instanceof State)) {
        return false;
      }
      final State that = (State) other;
      return mPc == that.mPc && Arrays.equals(mRegisters, that.mRegisters);
    }

    private BigInteger[] set(final int r, final BigInteger value) {
      final BigInteger[] updated = mRegisters.clone();
      updated[r] = value;
      return updated;
    }
  }

  private static final class Execution {
    private final int mEnd;
    private final ArrayList<State> mStates = new ArrayList<>();
    private final Map<State, Integer> mIds = new HashMap<>();
    private final int[][] mEdges = new int[STATE_CAP][2];
    private boolean mOpen;

    private Execution(final int end, final int registers) {
      mEnd = end;
      final BigInteger[] initial = new BigInteger[registers];
      Arrays.fill(initial, BigInteger.ZERO);
      state(0, initial);
    }

    private int state(final int pc, final BigInteger[] registers) {
      if (pc < 0 || pc > mEnd) {
        return REJECT;
      }
      if (pc == mEnd) {
        return HALT;
      }
      final State state = new State(pc, registers);
      final Integer old = mIds.get(state);
      if (old != null) {
        return old;
      }
      final int id = mStates.size();
      if (id == STATE_CAP) {
        mOpen = true;
        return OPEN;
      }
      mStates.add(state);
      mIds.put(state, id);
      return id;
    }

    private void expand(final Instruction[] code) {
      for (int i = 0; i < mStates.size(); ++i) {
        final State s = mStates.get(i);
        final Instruction op = code[s.mPc];
        final int next = s.mPc + 1;
        final int r = op.mReg;
        if (op.mOp == '!') {
          mEdges[i][0] = state(next, s.set(r, BigInteger.ZERO));
          mEdges[i][1] = state(next, s.set(r, BigInteger.ONE));
          continue;
        }
        final BigInteger v = op.mConstant ? BigInteger.valueOf(op.mValue) : s.mRegisters[op.mValue];
        int destination = next;
        BigInteger[] values = s.mRegisters;
        if (op.mOp == '=' && values[r].equals(v)) {
          final BigInteger target = values[op.mTarget];
          destination = target.bitLength() < Integer.SIZE ? target.intValue() : -1;
        } else if (op.mOp == '&' || op.mOp == '+') {
          values = s.set(r, op.mOp == '+' ? values[r].add(v) : v);
        }
        mEdges[i][0] = state(destination, values);
        mEdges[i][1] = mEdges[i][0];
      }
    }

    private static boolean success(final int id, final boolean open) {
      return id == HALT || open && id == OPEN;
    }

    private static boolean reaches(final int id, final boolean[] good, final boolean open) {
      return id >= 0 ? good[id] : success(id, open);
    }

    private Q probability(final boolean open) {
      final int n = mStates.size();
      final boolean[] good = new boolean[n];
      boolean changed;
      do {
        changed = false;
        for (int i = n - 1; i >= 0; --i) {
          if (!good[i] && (reaches(mEdges[i][0], good, open) || reaches(mEdges[i][1], good, open))) {
            good[i] = true;
            changed = true;
          }
        }
      } while (changed);
      if (!good[0]) {
        return Q.ZERO;
      }
      final int[] cols = new int[n];
      int size = 0;
      boolean all = true;
      for (int i = 0; i < n; ++i) {
        cols[i] = good[i] ? size++ : -1;
        all &= reaches(mEdges[i][0], good, open) && reaches(mEdges[i][1], good, open);
      }
      if (all && size == n) {
        return Q.ONE;
      }
      // Solve the absorbing-chain equations on the transient states that
      // can reach success. Closed classes outside this set have mass zero.
      final Q[][] a = new Q[size][size + 1];
      for (int i = 0; i < n; ++i) {
        final int row = cols[i];
        if (row >= 0) {
          Arrays.fill(a[row], Q.ZERO);
          a[row][row] = Q.TWO;
          for (final int dest : mEdges[i]) {
            if (dest >= 0 && cols[dest] >= 0) {
              a[row][cols[dest]] = a[row][cols[dest]].subtract(1);
            } else if (success(dest, open)) {
              a[row][size] = a[row][size].add(1);
            }
          }
        }
      }
      for (int i = size - 1; i > 0; --i) {
        for (int j = 0; j < i; ++j) {
          if (a[j][i].signum() != 0) {
            final Q ratio = a[j][i].divide(a[i][i]);
            for (int k = 0; k <= size; ++k) {
              a[j][k] = a[j][k].subtract(ratio.multiply(a[i][k]));
            }
          }
        }
      }
      return a[0][size].divide(a[0][0]);
    }
  }

  private static final class Census {
    private final Map<Integer, List<Instruction>> mForms = new HashMap<>();
    private final Instruction[] mCode = new Instruction[CODE_CAP];
    private final Q[] mLower = new Q[CODE_CAP + 1];
    private final Q[] mUpper = new Q[CODE_CAP + 1];
    private final long[] mStraight = new long[CODE_CAP + 1];
    private final long[] mCounts = new long[CODE_CAP + 1];

    private Census() {
      Arrays.fill(mLower, Q.ZERO);
      Arrays.fill(mUpper, Q.ZERO);
    }

    private static void addForms(final List<Instruction> out, final int space, final int r, final int value,
                                final boolean literal, final int width, final int registers) {
      if (width + 3 <= space) {
        out.add(new Instruction('&', r, value, literal, 0, width + 3, registers));
        out.add(new Instruction('+', r, value, literal, 0, width + 3, registers));
      }
      if (width + 5 <= space) {
        for (int t = 0; t <= registers && t < REGISTERS; ++t) {
          out.add(new Instruction('=', r, value, literal, t, width + 5, Math.max(registers, t + 1)));
        }
      }
    }

    private static List<Instruction> makeForms(final int space, final int registers) {
      final ArrayList<Instruction> out = new ArrayList<>();
      for (int r = 0; r <= registers && r < REGISTERS; ++r) {
        final int more = Math.max(registers, r + 1);
        out.add(new Instruction('!', r, 0, true, 0, 2, more));
        for (int v = 0; v <= more && v < REGISTERS; ++v) {
          addForms(out, space, r, v, false, 1, Math.max(more, v + 1));
        }
        if (space >= 4) {
          for (int v = 0; v < 1 << (space - 3); ++v) {
            addForms(out, space, r, v, true, Math.max(1, Integer.SIZE - Integer.numberOfLeadingZeros(v)), more);
          }
        }
      }
      return out;
    }

    private void visit(final int used, final int depth, final int registers, final boolean branches) {
      final int width = used + 1; // Final HALT instruction.
      ++mCounts[width];
      if (branches) {
        final Execution run = new Execution(depth, registers);
        run.expand(mCode);
        final Q lower = run.probability(false);
        mLower[width] = mLower[width].add(lower);
        mUpper[width] = mUpper[width].add(run.mOpen ? run.probability(true) : lower);
      } else {
        ++mStraight[width];
      }
      final int space = CODE_CAP - width;
      if (space >= 2) {
        for (final Instruction ins : mForms.computeIfAbsent(space * (REGISTERS + 1) + registers,
            k -> makeForms(space, registers))) {
          mCode[depth] = ins;
          visit(used + ins.mLength, depth + 1, ins.mRegisters, branches || ins.mOp == '=');
        }
      }
    }

    private static Q codeWeight() {
      final Q z = new Q(1, 16);
      final Q number = z.add(z.divide(Q.ONE.subtract(z.multiply(2))));
      final Q setConstant = number.divide(16 * 16 * 16).multiply(2);
      final Q compareConstant = number.divide(1 << 20);
      final Q setRegister = new Q(2, 1 << 16);
      final Q compareRegister = new Q(1, 1 << 24);
      final Q[] f = new Q[REGISTERS + 1];
      for (int d = REGISTERS; d >= 0; --d) {
        final Q[] row = new Q[f.length];
        Arrays.fill(row, Q.ZERO);
        for (int r = 0; r <= d && r < REGISTERS; ++r) {
          final int more = Math.max(d, r + 1);
          row[more] = row[more].add(new Q(1, 256)).add(setConstant);
          for (int v = 0; v <= more && v < REGISTERS; ++v) {
            final int used = Math.max(more, v + 1);
            row[used] = row[used].add(setRegister);
            for (int t = 0; t <= used && t < REGISTERS; ++t) {
              final int next = Math.max(used, t + 1);
              row[next] = row[next].add(compareRegister);
            }
          }
          for (int t = 0; t <= more && t < REGISTERS; ++t) {
            final int next = Math.max(more, t + 1);
            row[next] = row[next].add(compareConstant);
          }
        }
        Q sum = z;
        for (int i = d + 1; i < f.length; ++i) {
          sum = sum.add(row[i].multiply(f[i]));
        }
        f[d] = sum.divide(Q.ONE.subtract(row[d]));
      }
      return f[0];
    }

    private Z prefix() {
      visit(0, 0, 0, false);
      Q lower = Q.ZERO;
      Q upper = codeWeight();
      for (int i = 1; i <= CODE_CAP; ++i) {
        final Z scale = Z.ONE.shiftLeft(4 * i);
        lower = lower.add(mLower[i].add(mStraight[i]).divide(scale));
        // All code outside the finite enumeration is conservatively
        // counted with data mass one, by prefix-freeness of READ/HALT.
        upper = upper.add(mUpper[i].add(mStraight[i] - mCounts[i]).divide(scale));
      }
      final Z scale = Z.ONE.shiftLeft(BITS);
      final Z a = lower.multiply(scale).floor();
      if (!a.equals(upper.multiply(scale).floor())) {
        throw new IllegalStateException("Halting-probability bounds do not give a unique prefix");
      }
      return a;
    }
  }

  private int mN;
  private Z mPrefix;

  @Override
  public Z next() {
    if (mN == BITS) {
      throw new UnsupportedOperationException("Only the first " + BITS + " bits are certified");
    }
    if (mPrefix == null) {
      mPrefix = new Census().prefix();
    }
    return mPrefix.testBit(BITS - 1 - mN++) ? Z.ONE : Z.ZERO;
  }
}
