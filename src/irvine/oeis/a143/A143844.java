package irvine.oeis.a143;
// Generated by gen_seq4.pl modpas2/trian at 2021-11-12 23:48

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A143844 Triangle T(n,k) = k^2 read by rows.
 * @author Georg Fischer
 */
public class A143844 extends Triangle {

  @Override
  protected Z compute(final int n, final int k) {
    return Z.valueOf(k * (long) k);
  }
}
