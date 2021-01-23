package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038104 Numbers n with property that n is a substring of its base 4 representation.
 * @author Sean A. Irvine
 */
public class A038104 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, 4);
      final Z z = new Z(s);
      if (z.toString(4).contains(s)) {
        return z;
      }
    }
  }
}
