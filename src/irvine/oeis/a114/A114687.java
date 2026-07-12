package irvine.oeis.a114;
// manually deldel at 2026-07-12 21:04

import irvine.math.z.Z;
import irvine.oeis.a000.A000035;
import irvine.oeis.a010.A010673;
import irvine.oeis.transform.DelehamDeltaSequence;

/**
 * A114687 Triangle read by rows: T(n,k) is the number of double rise-bicolored Dyck paths (double rises come in two colors; also called marked Dyck paths) of semilength n and having k double rises (0 &lt;= k &lt;= n-1).
 * where DELTA is the operator defined in J084938.- _Philippe Del√©ham_, Jan 02 2009
 * @author Georg Fischer
 */
public class A114687 extends DelehamDeltaSequence {


  /** Construct the sequence. */
  public A114687() {
    super(1, new A000035().skip(1), new A010673());
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
