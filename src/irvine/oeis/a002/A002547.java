package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002547 Numerator of the n-th harmonic number H(n) divided by (n+1); a(n) = A001008(n) / ((n+1)*A002805(n)).
 * @author Sean A. Irvine
 */
public class A002547 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002547(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002547() {
    super(1);
  }

  private long mN = -1;
  private Z mF = Z.ONE;

  protected Q step() {
    ++mN;
    mF = mF.multiply(mN + 2);
    return new Q(Stirling.firstKind(mN + 2, 2).multiply2(), mF).abs();
  }

  @Override
  public Z next() {
    return step().num();
  }
}
