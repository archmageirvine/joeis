package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030669 Cube root of A030668.
 * @author Sean A. Irvine
 */
public class A030669 extends A030668 {

  @Override
  public Z next() {
    return super.next().root(3);
  }
}

