package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A082292 a(n) = (2*n+1) * (2*n)! / (sqrt(4*(n+1)*Product_{k=1..2*n+1} lcm(k, 2*n+2-k))).
 * @author Sean A. Irvine
 */
public class A082292 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Functions.FACTORIAL.z(2L * mN).multiply(2L * mN + 1).divide(Integers.SINGLETON.product(1, 2 * mN + 1, k -> Functions.LCM.z(k, 2L * mN + 2 - k)).multiply(mN + 1).sqrt().multiply2());
  }
}
