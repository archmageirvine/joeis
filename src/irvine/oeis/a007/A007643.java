package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a014.A014121;

/**
 * A007643 Primes not of form <code>| 3^x - 2^y |</code>.
 * @author Sean A. Irvine
 */
public class A007643 extends ComplementSequence {

  /** Construct the sequence. */
  public A007643() {
    super(new A014121());
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.isPrime()) {
        return n;
      }
    }
  }
}
