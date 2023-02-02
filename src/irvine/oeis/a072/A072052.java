package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a061.A061281;

/**
 * A061281.
 * @author Sean A. Irvine
 */
public class A072052 extends A061281 {

  @Override
  protected Z select(final long[] abcd) {
    return Z.valueOf(abcd[2]);
  }
}
