package irvine.oeis.a119;
// manually deldel at 2026-07-12 22:47

import irvine.math.z.Z;
import irvine.oeis.a154.A154955;
import irvine.oeis.transform.DelehamDeltaSequence;

/**
 * A119473 Triangle read by rows: T(n,k) is number of binary words of length n and having k runs of 0&apos;s of odd length, 0 &lt;= k &lt;= ceiling(n/2). (A run of 0&apos;s is a subsequence of consecutive 0&apos;s of maximal length.)
 * where DELTA is the operator defined in J084938.- _Philippe Del√©ham_, Dec 07 2011
 * @author Georg Fischer
 */
public class A119473 extends DelehamDeltaSequence {


  /** Construct the sequence. */
  public A119473() {
    super(0, new A154955().prepend(1), new A154955());
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
