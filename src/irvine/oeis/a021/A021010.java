package irvine.oeis.a021;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A021010 Triangle of coefficients of Laguerre polynomials L_n(x) (powers of x in decreasing order).
 * @author Sean A. Irvine
 */
public class A021010 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
    }
    final Z t = mF.factorial(mN).divide(mF.factorial(mM)).multiply(Binomial.binomial(mN, mM));
    return (mM & 1) == 0 ? t : t.negate();
  }
}

