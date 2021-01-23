package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A038532 Primes that are concatenations of k-th composite and k-th prime.
 * @author Sean A. Irvine
 */
public class A038532 extends A000040 {

  private final Sequence mCompos = new A002808();

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z(mCompos.next() + super.next().toString());
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
