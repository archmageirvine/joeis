package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A024708 Number of distinct prime divisors of n-th term of A024702.
 * @author Sean A. Irvine
 */
public class A024708 extends A024702 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(super.next()));
  }
}
