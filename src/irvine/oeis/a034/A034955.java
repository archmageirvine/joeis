package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034955 Even triangular numbers with prime indices.
 * @author Sean A. Irvine
 */
public class A034955 extends A034953 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isEven()) {
        return t;
      }
    }
  }
}
