package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A019310 Number of words of length n (n &gt;= 1) over a two-letter alphabet having a minimal period of size n-1.
 * @author Sean A. Irvine
 */
public class A019310 extends MemorySequence {

  {
    setOffset(1);
    add(null); // 0th
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return n == 1 ? Z.ZERO : Z.TWO;
    }
    return get(n - 1).multiply2().signedAdd((n & 1) == 0, get((n + 1) / 2));
  }
}
