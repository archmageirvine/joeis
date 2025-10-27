package irvine.oeis.a073;
// manually 2025-10-26; *ML=106

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A073757 a(n) = d(n) + phi(n) - 1.
 * @author Georg Fischer
 */
public class A073757 extends AbstractSequence implements DirectSequence {

  protected int mN;

  /** Construct the sequence. */
  public A073757() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    return a(++mN);
  }


  @Override
  public Z a(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    return fs.sigma0().add(fs.phi()).subtract(1);
  }

  @Override
  public Z a(final int n) {
    final FactorSequence fs = Jaguar.factor(n);
    return fs.sigma0().add(fs.phi()).subtract(1);
  }

}
