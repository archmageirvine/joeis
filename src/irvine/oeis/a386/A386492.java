package irvine.oeis.a386;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A386492 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A386492 extends A386490 {

  @Override
  protected Q t(final long n, final long m) {
    return new Q(Z.valueOf(m * m - 1).multiply(n), m * m + 1);
  }
}
