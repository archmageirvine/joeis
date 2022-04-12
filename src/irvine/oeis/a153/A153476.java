package irvine.oeis.a153;
// manually partsumm/partsum at 2022-04-12

import irvine.math.z.Z;

/**
 * A153476 Sum of first n even superperfect numbers A061652, divided by 2.
 * @author Georg Fischer
 */
public class A153476 extends A153475 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
