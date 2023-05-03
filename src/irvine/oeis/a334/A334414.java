package irvine.oeis.a334;

import irvine.math.z.Z;

/**
 * A334414 First differences of A334415.
 * @author Georg Fischer
 */
public class A334414 extends A334413 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
