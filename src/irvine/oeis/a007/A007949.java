package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007949 Greatest k such that 3^k divides n. Or, 3-adic valuation of n.
 * @author Sean A. Irvine
 */
public class A007949 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A007949(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A007949() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long c = 0;
    while (m % 3 == 0) {
      m /= 3;
      ++c;
    }
    return Z.valueOf(c);
  }
}
