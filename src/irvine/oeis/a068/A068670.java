package irvine.oeis.a068;
// manually 2021-06-22

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068670 Number of digits in the concatenation of first n primes.
 * @author Georg Fischer
 */
public class A068670 extends A000040 {

  {
    setOffset(0);
  }

  private long mSum = 0;

  @Override
  public Z next() {
    final Z result = Z.valueOf(mSum);
    mSum += super.next().toString().length();
    return result;
  }
}
