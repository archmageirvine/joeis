package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005942 a(2n) = a(n) + a(n+1), a(2n+1) = 2a(n+1), if n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A005942 extends MemorySequence {

  private static final Z[] INITIAL = {Z.ONE, Z.TWO, Z.FOUR, Z.SIX};

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 4) {
      return INITIAL[n];
    }
    return (n & 1) == 0 ? get(n / 2).add(get(n / 2 + 1)) : get((n + 1) / 2).multiply2();
  }
}

