package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a002.A002955;

/**
 * A052321.
 * @author Sean A. Irvine
 */
public class A052321 extends A002955 {

  protected Z b(final int n) {
    return get(n).subtract(n == 3 ? 1 : 0);
  }
}
