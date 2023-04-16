package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a036.A036796;

/**
 * A062877 Apart from the initial term (0), each a(n) is representable as a sum of distinct odd-indexed Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A062877 extends A036796 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
