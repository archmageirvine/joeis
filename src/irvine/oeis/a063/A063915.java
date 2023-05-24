package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A063915 G.f.: (1 + Sum_{ i &gt;= 0 } 2^i*x^(2^(i+1)-1)) / (1-x)^2.
 * @author Sean A. Irvine
 */
public class A063915 extends MemorySequence {

  @Override
  public Z a(final int n) {
    return n < 0 ? Z.ZERO : super.a(n);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return a(n / 2 - 1).add(a((n + 1) / 2 - 1)).multiply2().add(1);
  }
}

