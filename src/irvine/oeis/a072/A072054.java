package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a061.A061281;

/**
 * A072054 Smallest of 3 integer distances referred to in A061281.
 * @author Sean A. Irvine
 */
public class A072054 extends A061281 {

  @Override
  protected Z select(final long[] abcd) {
    return Z.valueOf(abcd[0]);
  }
}
