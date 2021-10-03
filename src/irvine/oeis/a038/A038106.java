package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038106 Numbers k with the property that k is a substring of its base-6 representation.
 * @author Sean A. Irvine
 */
public class A038106 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, 6);
      final Z z = new Z(s);
      if (z.toString(6).contains(s)) {
        return z;
      }
    }
  }
}
