package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030477 Numbers k such that k^2 has property that all even digits occur together and all odd digits occur together.
 * @author Sean A. Irvine
 */
public class A030477 extends A030476 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
