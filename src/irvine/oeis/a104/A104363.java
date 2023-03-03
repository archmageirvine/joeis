package irvine.oeis.a104;
// manually knest/eulphi at 2023-03-01 16:41

import irvine.math.z.Euler;
import irvine.math.z.Z;

/**
 * A104363 Euler's totient of A104357(n) = A104350(n) - 1.
 * @author Georg Fischer
 */
public class A104363 extends A104357 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}
