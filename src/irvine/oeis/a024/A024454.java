package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a007.A007504;

/**
 * A024454 <code>[ (4th</code> elementary symmetric function of <code>P(n))/(first</code> elementary symmetric function of <code>P(n)) ]</code>, where <code>P(n) =</code> {first <code>n+3</code> primes}.
 * @author Sean A. Irvine
 */
public class A024454 extends A024449 {

  private final Sequence mA = new SkipSequence(new A007504(), 4);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
