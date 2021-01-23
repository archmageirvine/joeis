package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A024456 [ 4th elementary symmetric function of P(n))/(2nd elementary symmetric function of P(n)) ], where P(n) = {first n+3 primes}.
 * @author Sean A. Irvine
 */
public class A024456 extends A024449 {

  private final Sequence mA = new SkipSequence(new A024447(), 3);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
