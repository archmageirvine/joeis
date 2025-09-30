package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080758.
 * @author Sean A. Irvine
 */
public class A080767 extends A080766 {

  @Override
  protected Z select(final long n, final long m) {
    return Z.valueOf(m);
  }
}
