package irvine.oeis.a295;
// manually knest/eulphi at 2023-03-01 16:41

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a002.A002283;

/**
 * A295503 a(n) = phi(10^n-1), where phi is Euler's totient function (A000010).
 * @author Georg Fischer
 */
public class A295503 extends A002283 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}
