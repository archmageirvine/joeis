package irvine.oeis.a125;
// manually deldel at 2026-07-12 21:04

import irvine.math.z.Z;
import irvine.oeis.a004.A004526;
import irvine.oeis.a010.A010673;
import irvine.oeis.transform.DelehamDeltaSequence;

/**
 * A125553 Triangle read by rows: T(n,k) = S1(n,k)*2^k, where S1(n,k) is an unsigned Stirling number of the first kind (cf. A008275) (n &gt;= 1, 1 &lt;= k &lt;= n).
 * where DELTA is the operator defined in J084938.- _Philippe Del√©ham_, Jan 05 2007
 * @author Georg Fischer
 */
public class A125553 extends DelehamDeltaSequence {


  /** Construct the sequence. */
  public A125553() {
    super(1, new A004526().skip(1), new A010673().skip(1));
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
