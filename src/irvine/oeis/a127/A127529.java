package irvine.oeis.a127;
// manually deldel at 2026-07-12 22:47

import irvine.math.z.Z;
import irvine.oeis.a000.A000035;
import irvine.oeis.a135.A135528;
import irvine.oeis.transform.DelehamDeltaSequence;

/**
 * A127529 Triangle read by rows: T(n,k) is the number of ordered trees with n edges and jump-length equal to k (n &gt;= 0, 0 &lt;= k &lt;= n-2).
 * where DELTA is the operator defined in J084938.- _Philippe Del√©ham_, Feb 06 2012
 * @author Georg Fischer
 */
public class A127529 extends DelehamDeltaSequence {


  /** Construct the sequence. */
  public A127529() {
    super(0, new A135528(), new A000035().prepend(0));
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
