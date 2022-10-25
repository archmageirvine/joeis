package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a002.A002955;

/**
 * A052327 Number of rooted trees with a forbidden limb of length 4.
 * @author Sean A. Irvine
 */
public class A052327 extends A002955 {

  @Override
  protected Z b(final int n) {
    return a(n).subtract(n == 4 ? 1 : 0);
  }
}
