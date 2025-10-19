package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a100.A100640;

/**
 * A002176 a(n) = LCM of denominators of Cotesian numbers {C(n,k), 0 &lt;= k &lt;= n}.
 * @author Sean A. Irvine
 */
public class A002176 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002176(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002176() {
    super(1);
  }

  protected int mN = 0;

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
    Z s = Z.ONE;
    for (int k = 0; k <= n; ++k) {
      s = s.lcm(A100640.cotesian(n, k).den());
    }
    return s;
  }

}
