package irvine.oeis.a127;
// manually deldel at 2026-07-12 22:47

import irvine.math.z.Z;
import irvine.oeis.a000.A000007;
import irvine.oeis.a152.A152271;
import irvine.oeis.transform.DelehamDeltaSequence;

/**
 * A127743 Triangular array where T(n,k) is the number of set partitions of n with k atomic parts.
 * where DELTA is the operator defined in J084938.- _Philippe Del√©ham_, Aug 03 2007
 * @author Georg Fischer
 */
public class A127743 extends DelehamDeltaSequence {


  /** Construct the sequence. */
  public A127743() {
    super(1, new A152271().adjust(1, 0), new A000007());
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
