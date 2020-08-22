package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A024455 [ (3rd elementary symmetric function of P(n))/(2nd elementary symmetric function of P(n)) ], where P(n) = {first n+2 primes}.
 * @author Sean A. Irvine
 */
public class A024455 extends A024448 {

  private final Sequence mA = new SkipSequence(new A024447(), 2);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
