package irvine.oeis.a073;

import irvine.math.z.Z;

/**
 * A073667 Numbers which retain their position in A073666 (position not disturbed by the rearrangement).
 * @author Sean A. Irvine
 */
public class A073667 extends A073666 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.equals(++mN)) {
        return t;
      }
    }
  }
}
