package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a055.A055229;

/**
 * A056191 Characteristic cube divisor of n: cube of g = gcd(K,F), where K is the largest square root divisor of n (A000188) and F = n/(K*K) = A007913(n) is its squarefree part; g^2 divides K^2 = A008833(n) = g^2*L^2 and g divides F = gf.
 * @author Sean A. Irvine
 */
public class A056191 extends A055229 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
