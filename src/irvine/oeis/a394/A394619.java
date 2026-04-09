package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005361;
import irvine.oeis.a126.A126706;

/**
 * A394619 Number of divisors d | k such that d is neither squarefree nor squareful (in A332785) and k = A126706(n).
 * @author Sean A. Irvine
 */
public class A394619 extends A126706 {

  private final A005361 mPE = new A005361();

  @Override
  public Z next() {
    final Z k = super.next();
    return Z.ONE.add(Functions.SIGMA0.z(k)).subtract(Z.ONE.shiftLeft(Functions.OMEGA.i(k))).subtract(mPE.a(k));
  }

}
