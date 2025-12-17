package irvine.oeis.a391;

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

public class A391217 extends Sequence1 {

  private static final class Generator {
    private final int mMax;
    private final int[] mSeq;
    private ArrayList<Integer> mZeroIdx;

    private int mK = 1;
    private CR mPSum = CR.ZERO;
    private int mN = -1;

    private Generator(final int max) {
      mMax = max;
      mSeq = new int[max];
      mZeroIdx = new ArrayList<>(max);
      for (int i = 0; i < max; ++i) {
        mZeroIdx.add(i);
      }
    }

    private static CR pk(final int k) {
      // pk = -log(1 - 1/(k+1)^2) / log(2)
      final CR kp1 = CR.valueOf(k + 1);
      final CR frac = CR.ONE.divide(kp1.multiply(kp1));
      final CR inner = CR.ONE.subtract(frac);
      final CR log = inner.log();
      return log.negate().divide(CR.LOG2);
    }

    private int step() {
      ++mN;
      while (mN < mMax && mSeq[mN] == 0) {
        final CR pk = pk(mK);
        final CR pCond = pk.divide(CR.ONE.subtract(mPSum));
        final int m = mZeroIdx.size();
        final int bigM = pCond.multiply(CR.valueOf(m)).ceil().intValueExact();
        if (bigM > 0) {
          final ArrayList<Integer> nextZero = new ArrayList<>(m - bigM);

          int nextHit = 1;
          int hitIndex = 1;
          for (int pos = 1; pos <= m; ++pos) {
            final int idx = mZeroIdx.get(pos - 1);
            if (nextHit <= bigM && pos == hitIndex) {
              mSeq[idx] = mK;
              if (++nextHit <= bigM) {
                hitIndex = CR.valueOf(nextHit - 1).divide(pCond).floor().intValueExact() + 1;
              }
            } else {
              nextZero.add(idx);
            }
          }
          mZeroIdx = nextZero;
        }
        mPSum = mPSum.add(pk);
        ++mK;
      }
      return mSeq[mN];
    }
  }

  private int mM = 1000;
  private Generator mGen = new Generator(mM);

  @Override
  public Z next() {
    if (mGen.mN + 1 >= mGen.mMax) {
      // Recompute whole sequence to higher term
      final int skip = mM;
      mM *= 2;
      mGen = new Generator(mM);
      for (int k = 0; k < skip; ++k) {
        mGen.step();
      }
    }
    return Z.valueOf(mGen.step());
  }
}

