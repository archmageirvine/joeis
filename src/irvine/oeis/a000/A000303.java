package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a008.A008304;

/**
 * A000303 Number of permutations of [n] in which the longest increasing run has length 2.
 * @author Sean A. Irvine
 */
public class A000303 extends A008304 {

  @Override
  public Z next() {
    return i(++mN, 2);
  }
}

