package irvine.oeis.a349;
// manually simgcd at 2023-08-12

import irvine.math.z.Z;
import irvine.oeis.a261.A261138;

/**
 * A349805 a(n) = A261138(n)/11.
 * @author Georg Fischer
 */
public class A349805 extends A261138 {

  @Override
  public Z next() {
    return super.next().divide(11);
  }
}
