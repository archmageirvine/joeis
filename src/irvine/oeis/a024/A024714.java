package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024714.
 * @author Sean A. Irvine
 */
public class A024714 extends A024702 {

  @Override
  public Z next() {
    return super.next().mod(Z.SEVEN);
  }
}
