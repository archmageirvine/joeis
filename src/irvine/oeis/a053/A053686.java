package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a085.A085237;

/**
 * A053686 Record gaps between consecutive primes that repeat at least once before a new record occurs.
 * @author Sean A. Irvine
 */
public class A053686 extends A085237 {

  private Z mPrev = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z g = mPrev;
      mPrev = super.next();
      if (g.equals(mPrev)) {
        do {
          mPrev = super.next();
        } while (mPrev.equals(g));
        return g;
      }
    }
  }
}
