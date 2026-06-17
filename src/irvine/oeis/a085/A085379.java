package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A085379 Greatest prime as sum of distinct divisors of n.
 * @author Sean A. Irvine
 */
public class A085379 extends Sequence2 {

  private long mN = 1;
  private Z mMax = Z.ZERO;

  private void search(final Z[] d, final int pos, final Z sum) {
    if (sum.compareTo(mMax) > 0 && sum.isProbablePrime()) {
      mMax = sum;
    }
    if (pos < d.length) {
      search(d, pos + 1, sum.add(d[pos]));
      search(d, pos + 1, sum);
    }
  }

  @Override
  public Z next() {
    ++mN;
    mMax = Z.ZERO;
    search(Jaguar.factor(mN).divisors(), 0, Z.ZERO);
    return mMax;
  }
}
