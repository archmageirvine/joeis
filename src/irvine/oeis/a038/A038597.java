package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038597 Numbers whose square is a difference between 2 positive cubes in at least one way.
 * @author Sean A. Irvine
 */
public class A038597 extends A038596 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
