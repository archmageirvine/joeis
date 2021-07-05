package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a002.A002955;

/**
 * A052328 Number of rooted trees with a forbidden limb of length 5.
 * @author Sean A. Irvine
 */
public class A052328 extends A002955 {

  @Override
  protected Z b(final int n) {
    return get(n).subtract(n == 5 ? 1 : 0);
  }
}
