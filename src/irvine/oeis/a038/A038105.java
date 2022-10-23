package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038105 Numbers n with property that n is a substring of its base 5 representation.
 * @author Sean A. Irvine
 */
public class A038105 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, 5);
      final Z z = new Z(s);
      if (z.toString(5).contains(s)) {
        return z;
      }
    }
  }
}
