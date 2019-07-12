package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A024456 <code>[ 4th</code> elementary symmetric function of P(n))/(2nd elementary symmetric function of <code>P(n)) ]</code>, where <code>P(n) =</code> {first <code>n+3</code> primes}.
 * @author Sean A. Irvine
 */
public class A024456 extends A024449 {

  private final Sequence mA = new SkipSequence(new A024447(), 3);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
