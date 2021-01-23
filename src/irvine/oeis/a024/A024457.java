package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A024457 [ (4th elementary symmetric function of P(n))/(3rd elementary symmetric function of P(n)) ], where P(n) = {first n+3 primes}.
 * @author Sean A. Irvine
 */
public class A024457 extends A024449 {

  private final Sequence mA = new SkipSequence(new A024448(), 1);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
