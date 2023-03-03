package irvine.oeis.a272;
// manually knest/eulphi at 2023-03-01 16:41

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000129;

/**
 * A272040 a(n) = A000010(A000129(n)).
 * @author Georg Fischer
 */
public class A272040 extends A000129 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}
