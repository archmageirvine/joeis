package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019516.
 * @author Sean A. Irvine
 */
public class A019516 implements Sequence {

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

