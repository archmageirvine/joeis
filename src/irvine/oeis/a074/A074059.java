package irvine.oeis.a074;
// manually egfu at 2021-12-07 18:55

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A074059 Dimension of the cohomology ring of the moduli space of n-pointed curves of genus 0 satisfying the associativity equations of physics (also known as the WDVV equations).
 * a(1) = 1; a(n) = a(n-1) + Sum_{k=2..n-1} binomial(n-1,k) * a(k) * a(n-k).
 * @author Georg Fischer
 */
public class A074059 extends MemorySequence {

  protected int mN;
  private Z mA_1;

  /** Construct the sequence. */
  public A074059() {
    mN = 0;
    add(Z.ONE);
    mA_1 = Z.ONE;
    setOffset(1);
  }

  @Override
  public Z computeNext() {
    ++mN;
    Z sum = mA_1;
    for (int k = 2; k < mN; ++k) {
      sum = sum.add(Binomial.binomial(mN - 1, k).multiply(a(k)).multiply(a(mN - k)));
    }
    mA_1 = sum;
    return sum;
  }
}
