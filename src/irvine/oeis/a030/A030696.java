package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030696 Cube root of A030695.
 * @author Sean A. Irvine
 */
public class A030696 extends A030695 {

  @Override
  public Z next() {
    return super.next().root(3);
  }
}

