package irvine.oeis.a082;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A082015 Antidiagonal sums of square array A082011 divided by the number of the antidiagonal.
 * @author Sean A. Irvine
 */
public class A082015 extends A082011 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next()).divide(mN + 1);
  }
}
