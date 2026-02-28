package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083967 Integers with the property that there exists a nontrivial partition such that the digit sum of both partitions is equal.
 * @author Sean A. Irvine
 */
public class A083967 extends Sequence1 {

  private long mN = 10;

  private boolean is(final long n) {
    long m = 10;
    while (m < n) {
      if (Functions.DIGIT_SUM.l(n / m) == Functions.DIGIT_SUM.l(n % m)) {
        return true;
      }
      m *= 10;
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
