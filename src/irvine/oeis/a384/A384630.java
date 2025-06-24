package irvine.oeis.a384;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384630 Number of self-inverse double cosets in Z_n\S_n/Z_n.
 * @author Sean A. Irvine
 */
public class A384630 extends Sequence1 {

  private long mN = 0;

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
    } else {
      for (final Z dd : Jaguar.factor(mN).divisors()) {
        final long d = dd.longValue();
        final long nd = mN / d;
        final Z m = Functions.PHI.z(d).multiply(Functions.FACTORIAL.z(nd));
        sum = sum.add(Integers.SINGLETON.sum(0, (int) (nd / 2), i -> m.multiply(dd.pow(i)).shiftRight(i).divide(Functions.FACTORIAL.z(i)).divide(Functions.FACTORIAL.z(nd - 2L * i))));
      }
    }
    return sum.divide(mN);
  }
}

