package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a007.A007504;

/**
 * A024453 <code>a(n) = [ (3rd</code> elementary symmetric function of <code>P(n))/(first</code> elementary symmetric function of <code>P(n)) ]</code>, where <code>P(n) =</code> {first <code>n+2</code> primes}.
 * @author Sean A. Irvine
 */
public class A024453 extends A024448 {

  private final Sequence mA = new SkipSequence(new A007504(), 3);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
