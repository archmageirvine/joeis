package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A008778 a(n) = (n+1)*(n^2 +8*n +6)/6. Number of n-dimensional partitions of 4. Number of terms in 4th derivative of a function composed with itself n times.
 * @author Sean A. Irvine
 */
public class A008778 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A008778(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A008778() {
    super(0);
  }

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(8).multiply(mN).add(6).multiply(mN.add(1)).divide(6);
  }
}
