package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000670 Fubini numbers: number of preferential arrangements of n labeled elements; or number of weak orders on n labeled elements; or number of ordered partitions of [n].
 * @author Sean A. Irvine
 */
public class A000670 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000670(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000670() {
    super(0);
  }

  protected int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    Z s = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      s = s.add(Functions.FACTORIAL.z(k).multiply(Functions.STIRLING2.z(n, k)));
    }
    return s;
  }

}
