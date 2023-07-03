package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A023847 Sum of exponents in prime-power factorization of binomial(5n, 2n).
 * @author Sean A. Irvine
 * @author Georg FIscher
 */
public class A023847 extends AbstractSequence {

  private long mN;
  private int mNf;
  private int mMf;
  private int mMa;

  /** Construct the sequence. */
  public A023847() {
    this(0, 5, 2, 0);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param nf factor of n
   * @param mf factor of m
   * @param ma add this to mf * m
   */
  public A023847(final int offset, final int nf, final int mf, final int ma) {
    super(offset);
    mN = offset - 1;
    mNf = nf;
    mMf = mf;
    mMa = ma;
  }

  protected long binomialOmega(final long n, final long m) {
    final FactorSequence fsTop = new FactorSequence();
    for (long k = m + 1; k <= n; ++k) {
      fsTop.add(k, FactorSequence.UNKNOWN, 1);
    }
    final FactorSequence fsBot = new FactorSequence();
    for (long k = 2; k <= n - m; ++k) {
      fsBot.add(k, FactorSequence.UNKNOWN, 1);
    }
    Jaguar.factor(fsTop);
    Jaguar.factor(fsBot);
    return fsTop.bigOmega() - fsBot.bigOmega();
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(binomialOmega(mNf * mN, mMf * mN + mMa));
  }
}

