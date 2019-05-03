package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A003000 Number of <code>bifix-free</code> (or primary, or unbordered) words of length n over a two-letter alphabet.
 * @author Sean A. Irvine
 */
public class A003000 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    } else if ((n & 1) == 0) {
      return get(n - 1).multiply2().subtract(get(n / 2));
    } else {
      return get(n - 1).multiply2();
    }
  }
}
