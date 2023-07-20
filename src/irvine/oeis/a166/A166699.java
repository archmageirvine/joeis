package irvine.oeis.a166;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A166699 Totally multiplicative sequence with a(p) = a(p-1) + 2 for prime p.
 * If n = Product p(k)^e(k) then a(n) = Product (a(p(k)-1)+2)^e(k).
 * @author Georg Fischer
 */
public class A166699 extends MemorySequence {

  private final int mParm;

  /** Construct the sequence. */
  public A166699() {
    this(1, 2);
  }

  protected A166699(final int offset, final int parm) {
    mParm = parm;
    super.add(Z.ZERO);
    setOffset(offset);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    final FactorSequence fs = Jaguar.factor(n);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(a(p.intValue() - 1).add(mParm).pow(fs.getExponent(p)));
    }
    return prod;
  }
}
