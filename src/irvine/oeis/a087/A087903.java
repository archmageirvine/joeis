package irvine.oeis.a087;
// manually deldel at 2026-07-12 21:04

import irvine.math.z.Z;
import irvine.oeis.a000.A000035;
import irvine.oeis.a142.A142150;
import irvine.oeis.transform.DelehamDeltaSequence;

/**
 * A087903 Triangle read by rows of the numbers T(n,k) (n &gt; 1, 0 &lt; k &lt; n) of set partitions of n of length k which do not have a proper subset of parts with a union equal to a subset {1,2,...,j} with j &lt; n.
 * where DELTA is the operator defined in J084938; see also ?086329 for a triangle transposed.- _Philippe Del√©ham_, Jun 13 2004
 * @author Georg Fischer
 */
public class A087903 extends DelehamDeltaSequence {


  /** Construct the sequence. */
  public A087903() {
    super(2, new A142150().skip(2), new A000035());
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
