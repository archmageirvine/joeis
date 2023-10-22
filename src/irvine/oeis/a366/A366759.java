package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a033.A033312;

/**
 * A366759 a(n) = phi(n!-1), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A366759 extends A033312 {

  {
    super.next();
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}
