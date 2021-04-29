package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046835 Internal digits of n^2 include digits of n as subsequence, n does not end in 0.
 * @author Sean A. Irvine
 */
public class A046835 extends A046834 {

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
