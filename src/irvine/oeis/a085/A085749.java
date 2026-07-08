package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085749 Largest prime p for which every solution of the congruence x^n + y^n == z^n (mod p) is such that p divides x*y*z.
 * @author Sean A. Irvine
 */
public class A085749 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return Functions.PREV_PRIME.z(CR.E.multiply(mF).add(1).ceil());
  }
}
