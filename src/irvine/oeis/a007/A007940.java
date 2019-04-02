package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007940 Noncubes such that some permutation of digits is a cube.
 * @author Sean A. Irvine
 */
public class A007940 extends A007939 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      n.root(3);
      if (n.auxiliary() == 0) {
        return n;
      }
    }
  }
}
