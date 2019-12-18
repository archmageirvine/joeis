package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028279 Even elements in 4-Pascal triangle <code>A028275</code> (by row).
 * @author Sean A. Irvine
 */
public class A028279 extends A028275 {

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
