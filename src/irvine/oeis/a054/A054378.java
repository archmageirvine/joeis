package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a039.A039752;

/**
 * A054378 Sums of prime factors of A039752, including multiplicities.
 * @author Sean A. Irvine
 */
public class A054378 extends A039752 {

  @Override
  protected Z select(final long mN, final Z sum) {
    return sum;
  }
}
