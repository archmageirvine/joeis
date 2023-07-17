package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007226 a(n) = 2*det(M(n; -1))/det(M(n; 0)), where M(n; m) is the n X n matrix with (i,j)-th element equal to 1/binomial(n + i + j + m, n).
 * @author Sean A. Irvine
 */
public class A007226 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A007226(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A007226() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(3 * mN, mN).multiply2().subtract(Binomial.binomial(3 * mN, mN + 1));
  }
}
