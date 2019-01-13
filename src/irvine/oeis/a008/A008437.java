package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a085.A085121;

/**
 * A008437.
 * @author Sean A. Irvine
 */
public class A008437 extends A085121 {

  @Override
  public Z next() {
    return super.next().divide(8);
  }
}
