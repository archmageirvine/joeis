package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063828 Smallest m associated with n-th Pillai prime (A063980).
 * @author Sean A. Irvine
 */
public class A063828 extends A063980 {

  @Override
  protected Z select(final Z p, final long m) {
    return Z.valueOf(m);
  }
}
