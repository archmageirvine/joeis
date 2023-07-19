package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064622 Values of n at which the ratio A005132(n)/n sets a new record.
 * @author Sean A. Irvine
 */
public class A064622 extends A064621 {

  @Override
  protected Z select(final Z t, final long n) {
    return Z.valueOf(n);
  }
}
