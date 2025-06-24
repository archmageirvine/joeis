package irvine.oeis.a384;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A384631 allocated for Ludovic Schwob.
 * @author Sean A. Irvine
 */
public class A384631 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    if ((mN & 1) == 0) {
      for (final Z dd : Jaguar.factor(mN / 2).divisors()) {
        final long d = dd.longValue();
        final long nd = mN / d;
        final Z m = Functions.PHI.z(d).multiply(Functions.FACTORIAL.z(nd));
        if ((d & 1) == 0) {
          final long nd2 = nd / 2;
          sum = sum.add(m.multiply(dd.divide2().pow(nd2)).divide(Functions.FACTORIAL.z(nd2)));
        } else {
          sum = sum.add(Integers.SINGLETON.sum(0, (int) nd / 2, i -> m.multiply(dd.pow(i)).shiftRight(i).divide(Functions.FACTORIAL.z(i)).divide(Functions.FACTORIAL.z(nd - 2L * i))));
        }
      }
      sum = sum.add(Functions.FACTORIAL.z(2 * (mN / 4)).multiply(mN / 2).multiply((mN & 3) / 2 + 1).divide(Functions.FACTORIAL.z(mN / 4)));
    } else {
      for (final Z dd : Jaguar.factor(mN).divisors()) {
        final long d = dd.longValue();
        final long nd = mN / d;
        final Z m = Functions.PHI.z(d).multiply(Functions.FACTORIAL.z(nd));
        sum = sum.add(Integers.SINGLETON.sum(0, (int) (nd / 2), i -> m.multiply(dd.pow(i)).shiftRight(i).divide(Functions.FACTORIAL.z(i)).divide(Functions.FACTORIAL.z(nd - 2L * i))));
      }
      if ((mN & 3) == 1) {
        sum = sum.add(Functions.FACTORIAL.z(mN / 2).multiply(mN).divide(Functions.FACTORIAL.z(mN / 4)));
      }
    }
    return sum.divide(2L * mN);
  }
}

