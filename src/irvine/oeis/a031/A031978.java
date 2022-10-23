package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A031978 Omit digits 0, 1, 8 from n.
 * @author Sean A. Irvine
 */
public class A031978 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(++mN).replaceAll("[018]", "");
      if (!s.isEmpty()) {
        return new Z(s);
      }
    }
  }
}
