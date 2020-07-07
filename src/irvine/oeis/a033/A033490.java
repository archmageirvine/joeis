package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A033490 <code>a(n) = 2*a(n-1) + a(floor(n/2))</code>, with <code>a(1) = 1, a(2) = 2</code>.
 * @author Sean A. Irvine
 */
public class A033490 extends MemorySequence {

  {
    add(null); // 0 unused
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n <= 2 ? Z.valueOf(n) : get(n - 1).multiply2().add(get(n / 2));
  }
}

