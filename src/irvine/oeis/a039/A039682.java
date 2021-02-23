package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039682 Even Fibonacci-lucky numbers.
 * @author Sean A. Irvine
 */
public class A039682 extends A039672 {

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
