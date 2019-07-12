package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a007.A007504;

/**
 * A024452 <code>a(n) = [ (2nd</code> elementary symmetric function of <code>P(n))/(first</code> elementary symmetric function of <code>P(n)) ]</code>, where <code>P(n) =</code> {first <code>n+1</code> primes}.
 * @author Sean A. Irvine
 */
public class A024452 extends A024447 {

  private final Sequence mA = new SkipSequence(new A007504(), 1);
  {
    next();
  }

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
