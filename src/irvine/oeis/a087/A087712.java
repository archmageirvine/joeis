package irvine.oeis.a087;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A087712 a(1) = 1; if n = k-th prime, a(n) = k; otherwise write all prime factors of n in nondecreasing order, replace each prime with its rank, and concatenate the ranks.
 * @author Georg Fischer
 */
public class A087712 extends AbstractSequence implements DirectSequence {

  private int mN;
  private final StringBuilder mSb = new StringBuilder();

  /** Construct the sequence. */
  public A087712() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    if (n.equals(Z.ONE)) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(n);
    if (fs.sigma0AsLong() == 2) {
      return Puma.primePiZ(n);
    }
    // composite
    mSb.setLength(0);
    for (final Z p : fs.toZArray()) {
      final String pis = String.valueOf(Puma.primePi(p));
      for (int k = fs.getExponent(p) - 1; k >= 0; --k) {
        mSb.append(pis);
      }
    }
    return new Z(mSb);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
