package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.math.zi.Zi;

/**
 * A078911 Let r+i*s be the sum of the distinct first-quadrant Gaussian integers dividing n; sequence gives s values.
 * @author Sean A. Irvine
 */
public class A078911 extends A078910 {

  @Override
  protected Z select(final Zi n) {
    return n.im();
  }
}
