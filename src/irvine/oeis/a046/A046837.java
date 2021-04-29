package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046837 Internal digits of n^2 include digits of n as substring, n does not end in 0.
 * @author Sean A. Irvine
 */
public class A046837 extends A046836 {

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
