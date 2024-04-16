package irvine.oeis.a165;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A165713 a(n) = the smallest integer &gt; n that is divisible by exactly the same number of distinct primes as n is.
 * @author Sean A. Irvine
 */
public class A165713 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final int target = Functions.OMEGA.i(++mN);
    long v = mN;
    while (Functions.OMEGA.i(++v) != target) {
      // do nothing
    }
    return Z.valueOf(v);
  }
}

