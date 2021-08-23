package irvine.oeis.a051;
// manually dersimple 2021-08-21

import irvine.math.z.Z;
import irvine.oeis.a050.A050825;

/**
 * A051134 (Terms in A050825)/2.
 * @author Georg Fischer
 */
public class A051134 extends A050825 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
