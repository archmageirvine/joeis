package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038102 Numbers k such that k is a substring of its base-2 representation.
 * @author Sean A. Irvine
 */
public class A038102 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toBinaryString(++mN);
      final Z z = new Z(s);
      if (z.toString(2).contains(s)) {
        return z;
      }
    }
  }
}
