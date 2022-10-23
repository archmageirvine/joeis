package irvine.oeis.a200;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A200313 E.g.f. satisfies: A(x) = exp(x^3*A(x)^3/3!).
 * a(n) = (3*n+1)^(n-1) * (3*n)!/(n!*(3!)^n).
 * @author Georg Fischer
 */
public class A200313 extends Sequence0 {

  protected static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;
  protected int mN;
  protected int mMult;

  /** Construct the sequence. */
  public A200313() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param mult factor for mN
   */
  public A200313(final int mult) {
    mN = -1;
    mMult = mult;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mMult * mN + 1).pow(mN - 1).multiply(FACTORIAL.factorial(mMult * mN))
      .divide(FACTORIAL.factorial(mN).multiply(FACTORIAL.factorial(mMult).pow(mN)));
  }
}
