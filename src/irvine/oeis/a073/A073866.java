package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;
import irvine.util.string.StringUtils;

/**
 * A073655.
 * @author Sean A. Irvine
 */
public class A073866 extends A002808 {

  @Override
  public Z next() {
    final int c = super.next().intValueExact();
    final int nines = c / 9;
    final int remaining = c % 9;
    final Z candidate = new Z(remaining + StringUtils.rep('9', nines));
    if (!candidate.isProbablePrime()) {
      return candidate;
    }
    // Try harder
    for (int r = remaining + 1, v = 8; r < 10; ++r, --v) {
      for (int k = 0; k < nines; ++k) {
        final Z c2 = new Z(r + StringUtils.rep('9', k) + v + StringUtils.rep('9', nines - 1 - k));
        if (!c2.isProbablePrime()) {
          return c2;
        }
      }
    }
    throw new RuntimeException();
  }
}
