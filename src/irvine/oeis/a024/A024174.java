package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A024174 a(n) is floor((4th elementary symmetric function of 1,2,..,n)/(3rd elementary symmetric function of 1,2,...,n)).
 * @author Sean A. Irvine
 */
public class A024174 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    return Functions.STIRLING1.z(mN + 1, mN - 3).negate().divide(Functions.STIRLING1.z(mN + 1, mN - 2));
  }
}
