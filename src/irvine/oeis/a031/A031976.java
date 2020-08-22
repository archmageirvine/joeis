package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031976 Remove digits 0, 1, 4, 9 from n.
 * @author Sean A. Irvine
 */
public class A031976 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(++mN).replaceAll("[0149]", "");
      if (!s.isEmpty()) {
        return new Z(s);
      }
    }
  }
}
