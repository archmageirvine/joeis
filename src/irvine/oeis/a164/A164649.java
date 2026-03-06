package irvine.oeis.a164;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A164649 Numbers k such that sigma(k)/phi(k) = 36/25.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A164649 extends AbstractSequence {

  private final Z mNumer;
  private final Z mDenom;
  private long mN;

  /** Construct the sequence. */
  public A164649() {
    this(1, 36, 25, 5797);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param numer numerator
   * @param denom denominator
   */
  public A164649(final int offset, final int numer, final int denom, final int start) {
    super(offset);
    mNumer = Z.valueOf(numer);
    mDenom = Z.valueOf(denom);
    mN = start - 1L;
  }

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z phi = fs.phi();
      if (phi.mod(mDenom).isZero()) {
        final Q q = new Q(fs.sigma(), phi);
        if (q.num().equals(mNumer) && q.den().equals(mDenom)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

