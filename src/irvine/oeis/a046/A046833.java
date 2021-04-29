package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046833 Internal digits of n^2 include digits of n, n does not end in 0.
 * @author Sean A. Irvine
 */
public class A046833 extends A046832 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(10) != 0) {
        return t;
      }
    }
  }
}
