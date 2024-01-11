package irvine.oeis.a108;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A108873 Numbers n whose base 3 representations, interpreted as base 10 integers, are semiprimes.
 * @author Georg Fischer
 */
public class A108873 extends AbstractSequence {

  private int mN;
  private int mBase;

  /** Construct the sequence. */
  public A108873() {
    this(0, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base numer base
   */
  public A108873(final int offset, final int base) {
    super(offset);
    mN = offset - 1;
    mBase = base;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z k = new Z(Integer.toString(mN, mBase));
      final int v = Jaguar.factorAllowIncomplete(k).isSemiprime();
      if (v == FactorSequence.UNKNOWN) {
        throw new UnsupportedOperationException("Could not determine semiprime status of " + k);
      }
      if (v == FactorSequence.YES) {
        return Z.valueOf(mN);
      }
    }
  }
}
