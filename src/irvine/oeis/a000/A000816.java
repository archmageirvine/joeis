package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000816.
 * @author Sean A. Irvine
 */
public class A000816 extends A000364 {

  @Override
  public Z next() {
    return super.next().shiftLeft(2 * mN - 1);
  }
}
