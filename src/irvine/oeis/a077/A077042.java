package irvine.oeis.a077;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A077042 Square array read by falling antidiagonals of central polynomial coefficients: largest coefficient in expansion of (1 + x + x^2 + ... + x^(n-1))^k = ((1-x^n)/(1-x))^k, i.e., the coefficient of x^floor(k*(n-1)/2) and of x^ceiling(k*(n-1)/2); also number of compositions of floor(k*(n+1)/2) into exactly k positive integers each no more than n.
 * @author Sean A. Irvine
 */
public class A077042 extends AbstractSequence {

  private int mN = -1;
  private int mM = 0;

  protected A077042(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A077042() {
    this(0);
  }

  protected Z t(final int n, final int m) {
    if (n == 0) {
      return m == 0 ? Z.ONE : Z.ZERO;
    }
    final int h = m * (n - 1) / 2;
    return Integers.SINGLETON.sum(0, h / n,
      k -> Z.NEG_ONE.pow(k).multiply(Binomial.binomial(m, k)).multiply(Binomial.binomial(m - 1 + h - n * k, m - 1)));
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
    }
    return t(mN - mM, mM);
  }
}

