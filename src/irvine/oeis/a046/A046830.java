package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046830 Digits of n^2 include digits of n as subsequence, n does not end in 0.
 * @author Sean A. Irvine
 */
public class A046830 extends A046829 {

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
