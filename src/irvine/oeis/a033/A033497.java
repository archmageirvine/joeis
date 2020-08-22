package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A033497 a(n) = 2*a(n-1) + a(floor(n/2)), with a(1) = 1, a(2) = 2, a(3) = 4.
 * @author Sean A. Irvine
 */
public class A033497 extends MemorySequence {

  private static final Z[] INITIAL = {Z.ONE, Z.TWO, Z.FOUR};
  {
    add(null); // 0 unused
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n <= INITIAL.length ? INITIAL[n - 1] : get(n - 1).multiply2().add(get(n / 2));
  }
}

