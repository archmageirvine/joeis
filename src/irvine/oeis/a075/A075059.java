package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A075059 a(n) = 1 + lcm(1, 2, ..., n) = 1 + A003418(n).
 * @author Georg Fischer
 */
public class A075059 extends A003418 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
