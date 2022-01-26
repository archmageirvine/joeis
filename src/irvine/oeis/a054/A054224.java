package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054224 A054221 without cubes.
 * @author Sean A. Irvine
 */
public class A054224 extends A054221 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      t.root(3);
      if (t.auxiliary() != 1) {
        return t;
      }
    }
  }
}
