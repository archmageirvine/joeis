package irvine.oeis.a021;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A021009 Triangle of coefficients of Laguerre polynomials <code>n!*L_n(x)</code> (rising powers of <code>x)</code>.
 * @author Sean A. Irvine
 */
public class A021009 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    final Z t = mF.factorial(mN).divide(mF.factorial(mM)).multiply(Binomial.binomial(mN, mM));
    return (mM & 1) == 0 ? t : t.negate();
  }
}

