package irvine.oeis.a091;
// manually deldel at 2026-07-12 21:04

import irvine.math.z.Z;
import irvine.oeis.a011.A011655;
import irvine.oeis.a022.A022003;
import irvine.oeis.transform.DelehamDeltaSequence;

/**
 * A091977 Triangle read by rows: T(n,k) is the number of Dyck paths of semilength n having k exterior pairs.
 * where DELTA is the operator defined in J084938.- _Philippe Del√©ham_, Feb 06 2012
 * @author Georg Fischer
 */
public class A091977 extends DelehamDeltaSequence {


  /** Construct the sequence. */
  public A091977() {
    super(0, new A011655().skip(1), new A022003());
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
