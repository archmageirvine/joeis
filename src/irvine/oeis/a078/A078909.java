package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.math.zi.Zi;

/**
 * A078909 Let r+i*s be the sum, with multiplicity, of the first-quadrant Gaussian primes dividing n; sequence gives s values.
 * @author Sean A. Irvine
 */
public class A078909 extends A078908 {

  @Override
  protected Z select(final Zi n) {
    return n.im();
  }
}
