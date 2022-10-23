package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A019516 Delete all 2's, 3's, 5's and 7's from the sequence of nonnegative integers.
 * @author Sean A. Irvine
 */
public class A019516 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(++mN).replaceAll("[2357]", "");
      if (!s.isEmpty()) {
        return new Z(s);
      }
    }
  }
}

