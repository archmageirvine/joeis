package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028317 Even elements in the 5-Pascal triangle A028313.
 * @author Sean A. Irvine
 */
public class A028317 extends A028313 {

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
