package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A065036 Product of the cube of a prime (A030078) and a different prime.
 * @author Sean A. Irvine
 */
public class A065036 extends AbstractSequence {

  private long mN;
  private int mExponent;

  /** Construct the sequence. */
  public A065036() {
    this(1, 3);
  }

  /** Generic constructor with parameter. */
  public A065036(final int offset, final int exponent) {
    super(offset);
    mExponent = exponent;
    mN = (1L << mExponent) * 3L - 1;
  }

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.omega() == 2) {
        final Z[] p = fs.toZArray();
        if ((fs.getExponent(p[0]) == mExponent && fs.getExponent(p[1]) == 1) || (fs.getExponent(p[0]) == 1 && fs.getExponent(p[1]) == 3)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

