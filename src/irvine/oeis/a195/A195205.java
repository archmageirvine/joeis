package irvine.oeis.a195;
// manually 2026-07-12/deldel at 2026-07-12 23:44

import irvine.math.z.Z;
import irvine.oeis.a010.A010674;
import irvine.oeis.transform.DelehamDeltaSequence;

/**
 * A195205 Triangle of coefficients of a sequence of binomial type polynomials.
 * where DELTA is the operator defined in J084938.- _Philippe Del√©ham_, Dec 22 2011
 * @author Georg Fischer
 */
public class A195205 extends DelehamDeltaSequence {


  /** Construct the sequence. */
  public A195205() {
    super(1, new A195013().prepend(0), new A010674().skip(1));
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
