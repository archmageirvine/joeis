package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002545 Numerator of Sum_{i+j+k=n; i,j,k &gt; 0} 1/(i*j*k).
 * @author Sean A. Irvine
 */
public class A002545 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002545(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002545() {
    super(3);
  }

  private long mN = -1;
  private Z mF = Z.TWO;

  protected Q step() {
    ++mN;
    mF = mF.multiply(mN + 3);
    return new Q(Functions.STIRLING1.z(mN + 3, 3).multiply(6), mF).abs();
  }

  @Override
  public Z next() {
    return step().num();
  }
}
