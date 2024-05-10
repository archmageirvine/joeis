package irvine.oeis.a108;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A108873 Numbers n whose base 3 representations, interpreted as base 10 integers, are semiprimes.
 * @author Georg Fischer
 */
public class A108873 extends AbstractSequence {

  private int mN;
  private final int mBase;

  /** Construct the sequence. */
  public A108873() {
    this(1, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base number base
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
      if (Jaguar.factorAllowIncomplete(k).isSemiprime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
