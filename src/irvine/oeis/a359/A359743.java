package irvine.oeis.a359;

import irvine.math.z.Z;

/**
 * A060981.
 * @author Sean A. Irvine
 */
public class A359743 extends A359742 {

  @Override
  protected Z select(final Z b0, final Z b1, final Z b2) {
    return b1;
  }
}
