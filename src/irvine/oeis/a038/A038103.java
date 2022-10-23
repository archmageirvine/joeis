package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038103 Numbers k such that k is a substring of its base-3 representation.
 * @author Sean A. Irvine
 */
public class A038103 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, 3);
      final Z z = new Z(s);
      if (z.toString(3).contains(s)) {
        return z;
      }
    }
  }
}
