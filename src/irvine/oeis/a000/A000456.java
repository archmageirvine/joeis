package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a008.A008304;

/**
 * A000456 Number of permutations of <code>[n]</code> in which the longest increasing run has length 5.
 * @author Sean A. Irvine
 */
public class A000456 extends A008304 {

  @Override
  public Z next() {
    return i(++mN, 5);
  }
}

