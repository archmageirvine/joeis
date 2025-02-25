package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075532 Number of rooted trees where each node at height h has 0 or h+1 children.
 * @author Sean A. Irvine
 */
public class A075532 extends A075533 {

  @Override
  protected Z count(final Tree tree) {
    return Z.ONE;
  }
}

