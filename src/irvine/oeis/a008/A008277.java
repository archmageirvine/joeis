package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A008277 Triangle of Stirling numbers of the second kind, S2(n,k), n &gt;= 1, 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A008277 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A008277(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A008277() {
    super(1);
  }

  private long mN = 0;
  protected long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Functions.STIRLING2.z(mN, mM);
  }
}

