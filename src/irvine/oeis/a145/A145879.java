package irvine.oeis.a145;
// manually deldel at 2026-07-12 19:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000012;
import irvine.oeis.a004.A004526;
import irvine.oeis.transform.DelehamDeltaSequence;

/**
 * A145879 Triangle read by rows: T(n,k) is the number of permutations of {1,2,...,n} having exactly k entries that are midpoints of 321 patterns (0 &lt;= k &lt;= n-2 for n &gt;= 2; k=0 for n=1).
 * where DELTA is the operator defined in J084938.- _Philippe Del√©ham_, Dec 26 2011
 * @author Georg Fischer
 */
public class A145879 extends DelehamDeltaSequence {


  /** Construct the sequence. */
  public A145879() {
    super(1, new A000012(), new A004526());
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
