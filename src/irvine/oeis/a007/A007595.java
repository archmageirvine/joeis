package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007595 a(n) = C_n / 2 if n is even or ( C_n + C_((n-1)/2) ) / 2 if n is odd, where C = Catalan numbers (A000108).
 * @author Sean A. Irvine
 */
public class A007595 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      return Functions.CATALAN.z(mN).divide2();
    } else {
      return Functions.CATALAN.z(mN).add(Functions.CATALAN.z(mN / 2)).divide2();
    }
  }
}
