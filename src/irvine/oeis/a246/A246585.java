package irvine.oeis.a246;
// manually (bisect) 2021-07-05

import irvine.math.z.Z;

/**
 * A246585 Zeroth trisection of A246584.
 * @author Georg Fischer
 */
public class A246585 extends A246584 {
  
  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}
