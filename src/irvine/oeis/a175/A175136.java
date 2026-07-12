package irvine.oeis.a175;
// manually deldel at 2026-07-12 20:55

import irvine.math.z.Z;
import irvine.oeis.a011.A011655;
import irvine.oeis.a079.A079978;
import irvine.oeis.transform.DelehamDeltaSequence;

/**
 * A175136 Triangle T(n,k) read by rows: number of LCO forests of size n with k leaves, 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A175136 extends DelehamDeltaSequence {

  /** Construct the sequence. */
  public A175136() {
    super(1, new A011655(), new A079978());
    super.next();
  }

  @Override
  public Z next() {
    Z result = super.next();
    while (result.isZero()) {
      result = super.next();
    }
    return result;
  }
}
