package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A008867 Triangle of truncated triangular numbers: k-th term in n-th row is number of dots in hexagon of sides k, n-k, k, n-k, k, n-k.
 * @author Sean A. Irvine
 */
public class A008867 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A008867(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A008867() {
    super(2);
  }

  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    final Z n = Z.valueOf(mN);
    return n.multiply(mN - 3).divide2().add(n.multiply(mM)).subtract(Z.valueOf(mM).square()).add(1);
  }
}

