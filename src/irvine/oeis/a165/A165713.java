package irvine.oeis.a165;

import irvine.factor.factor.Jaguar;
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
    final int target = Jaguar.factor(++mN).omega();
    long v = mN;
    while (Jaguar.factor(++v).omega() != target) {
      // do nothing
    }
    return Z.valueOf(v);
  }
}

