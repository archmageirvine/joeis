package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A024173 Integer part of ((4th elementary symmetric function of 1,2,..,n)/(2nd elementary symmetric function of 1,2,...,n)).
 * @author Sean A. Irvine
 */
public class A024173 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ZERO;
    }
    return Functions.STIRLING1.z(mN + 1, mN - 3).divide(Functions.STIRLING1.z(mN + 1, mN - 1));
  }
}
