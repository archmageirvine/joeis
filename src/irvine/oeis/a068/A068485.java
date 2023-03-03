package irvine.oeis.a068;
// manually knestm/knest at 2023-03-02 19:24

import irvine.math.z.Z;
import irvine.oeis.a067.A067755;

/**
 * A068485 One-sixtieth of the even leg of Pythagorean triangles whose other sides are both primes (other than 3, 5 or 13).
 * @author Georg Fischer
 */
public class A068485 extends A067755 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(60);
  }
}
