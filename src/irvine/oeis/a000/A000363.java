package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a008.A008971;

/**
 * A000363 Number of permutations of <code>[n]</code> with exactly 2 increasing runs of length at least 2.
 * @author Sean A. Irvine
 */
public class A000363 extends A008971 {

  private int mN = 3;

  @Override
  public Z next() {
    return get(++mN, 2);
  }
}

