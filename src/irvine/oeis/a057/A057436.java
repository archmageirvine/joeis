package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057436 Contains digits 1 through 6 only.
 * @author Sean A. Irvine
 */
public class A057436 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, 7);
      if (s.indexOf('0') < 0) {
        return new Z(s);
      }
    }
  }
}
