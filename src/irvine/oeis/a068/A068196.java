package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A068196 Origin numbers: integers unreachable by Bergerson's Alpha construction (see the Ross Eckler link).
 * @author Sean A. Irvine
 */
public class A068196 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private final Sequence mComposites = new A002808();
  private long mN = 27;
  private long mM = mComposites.next().longValue();

  private void augment(final long m, final long[] p) {
    for (long sign = 0; sign < 1L << p.length; ++sign) {
      long sum = m;
      long s = sign;
      for (final long v : p) {
        if ((s & 1) == 0) {
          sum += v;
        } else {
          sum -= v;
        }
        s >>>= 1;
      }
      mSeen.set(sum);
    }
  }

  private long[] getVector(final long m) {
    final FactorSequence fs = Jaguar.factor(m);
    final long[] res = new long[(int) fs.bigOmega()];
    int k = 0;
    for (final Z p : fs.toZArray()) {
      final long pp = p.longValue();
      for (int j = 0; j < fs.getExponent(p); ++j) {
        res[k++] = pp;
      }
    }
    return res;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (mM <= 2 * mN + 4) {
        final long[] p = getVector(mM);
        augment(mM, p);
        mM = mComposites.next().longValueExact();
      }
      if (!mSeen.isSet(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
