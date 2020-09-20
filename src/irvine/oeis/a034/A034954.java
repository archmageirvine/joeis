package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034954 Odd triangular numbers with prime indices.
 * @author Sean A. Irvine
 */
public class A034954 extends A034953 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isEven()) {
        return t;
      }
    }
  }
}
