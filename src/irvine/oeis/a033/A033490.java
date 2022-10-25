package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A033490 a(n) = 2*a(n-1) + a(floor(n/2)), with a(1) = 1, a(2) = 2.
 * @author Sean A. Irvine
 */
public class A033490 extends MemorySequence {

  {
    setOffset(1);
    add(null); // 0 unused
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n <= 2 ? Z.valueOf(n) : get(n - 1).multiply2().add(get(n / 2));
  }
}

