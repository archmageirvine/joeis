package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000055;

/**
 * A006790 Exponentiation of e.g.f. for trees A000055(n-1).
 * @author Sean A. Irvine
 */
public class A006790 extends MemorySequence {

  private final A000055 mSeq = new A000055();
  private final ArrayList<Z> mA55 = new ArrayList<>();

  {
    add(Z.ONE);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    mA55.add(mSeq.next());
    Z sum = Z.ZERO;
    for (int j = 1; j <= n; ++j) {
      sum = sum.add(Binomial.binomial(n - 1, j - 1).multiply(mA55.get(j - 1)).multiply(a(n - j)));
    }
    return sum;
  }
}
