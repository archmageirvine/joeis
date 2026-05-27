package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A085049 a(1) = 1, then the next n numbers are prime if n is composite, else are composite if n is a prime.
 * @author Sean A. Irvine
 */
public class A085049 extends Sequence1 {

  private final Sequence mPrime = new A000040();
  private final Sequence mComposite = new A002808();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      if (++mN == 1) {
        return Z.ONE;
      }
      mM = 0;
    }
    return Predicates.PRIME.is(mN) ? mComposite.next() : mPrime.next();
  }
}
