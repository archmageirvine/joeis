package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000946 Euclid-Mullin sequence: a(1) = 2, a(n+1) is the largest prime factor of 1 + Product_{k=1..n} a(k).
 * @author Sean A. Irvine
 */
public class A000946 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z res = mA.equals(Z.ONE) ? Z.TWO : Functions.GPF.z(mA.add(1));
    mA = mA.multiply(res);
    return res;
  }
}
