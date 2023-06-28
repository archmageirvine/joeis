package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a008.A008304;

/**
 * A000434 Number of permutations of [n] in which the longest increasing run has length 4.
 * @author Sean A. Irvine
 */
public class A000434 extends A008304 {

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}

