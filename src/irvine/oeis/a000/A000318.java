package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000318 Generalized tangent numbers d(4,n).
 * @author Sean A. Irvine
 */
public class A000318 extends A000182 {

  @Override
  public Z next() {
    return super.next().shiftLeft(4 * mN - 2);
  }
}

