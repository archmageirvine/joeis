package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a008.A008304;

/**
 * A000467 Number of permutations of [n] in which the longest increasing run has length 6.
 * @author Sean A. Irvine
 */
public class A000467 extends A008304 {

  @Override
  public Z next() {
    return t(++mN, 6);
  }
}

