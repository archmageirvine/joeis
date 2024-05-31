package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A024172 Integer part of ((3rd elementary symmetric function of 1,2,..,n)/(2nd elementary symmetric function of 1,2,...,n)).
 * @author Sean A. Irvine
 */
public class A024172 extends Sequence2 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.STIRLING1.z(mN + 3, mN).negate().divide(Functions.STIRLING1.z(mN + 3, mN + 1));
  }
}
