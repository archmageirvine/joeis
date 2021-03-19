package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A045690 Number of binary words of length n (beginning with 0) whose autocorrelation function is the indicator of a singleton.
 * @author Sean A. Irvine
 */
public class A045690 extends MemorySequence {

  {
    add(null); // 0th not used
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n < 2 ? Z.ONE : get(n - 1).multiply2().subtract(get(n / 2).multiply(1 - (n & 1)));
  }
}
