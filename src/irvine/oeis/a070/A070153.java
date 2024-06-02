package irvine.oeis.a070;

import irvine.math.z.Z;

/**
 * A070153 Take pairs (x,y) with Sum_{j = x..y} j = concatenation of x and y. Sort pairs on y then x. This sequence gives y of each pair.
 * @author Sean A. Irvine
 */
public class A070153 extends A070152 {

  @Override
  protected Z select(final long x, final long y) {
    return Z.valueOf(y);
  }
}
