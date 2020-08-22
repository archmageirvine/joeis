package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A004003 Number of domino tilings (or dimer coverings) of a 2n X 2n square.
 * @author Sean A. Irvine
 */
public class A004003 extends MemorySequence {

  private int mN = -1;

  private CR cos2(final int m, final int n) {
    final CR cos = CR.PI.multiply(m).divide(CR.valueOf(2L * n + 1)).cos();
    return cos.multiply(cos);
  }

  private CR product(final CR jcos2, final int n) {
    CR prod = CR.ONE;
    for (int k = 1; k <= n; ++k) {
      prod = prod.multiply(jcos2.add(cos2(k, n)));
    }
    return prod;
  }

  @Override
  protected Z computeNext() {
    ++mN;
    CR prod = CR.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(product(cos2(k, mN), mN));
    }
    return prod.shiftLeft(2 * mN * mN).round();
  }
}

