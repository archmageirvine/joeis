package irvine.oeis.a016;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A016017 Smallest k such that 1/k can be written as a sum of exactly 2 unit fractions in n ways.
 * @author Sean A. Irvine
 */
public class A016017 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A016017(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A016017() {
    super(1);
  }

  protected long mN = 0;

  protected int v() {
    return 2;
  }

  @Override
  public Z next() {
    mN += v();
    long k = 0;
    while (true) {
      final FactorSequence fs = new FactorSequence();
      fs.add(++k, FactorSequence.UNKNOWN, v());
      Jaguar.factor(fs);
      if (fs.sigma0AsLong() + v() - 1 == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
