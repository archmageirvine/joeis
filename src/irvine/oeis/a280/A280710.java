package irvine.oeis.a280;
// manually 2024-05-08

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A280710 Characteristic function of squarefree semiprimes.
 * @author Georg Fischer
 */
public class A280710 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A280710() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    final Z[] f = fs.toZArray();
    return (f.length == 2 && fs.getExponent(f[0]) == 1 && fs.getExponent(f[1]) == 1) ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
