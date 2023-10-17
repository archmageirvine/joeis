package irvine.oeis.a366;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a024.A024140;

/**
 * A049479 Smallest prime dividing 2^n - 1.
 * @author Sean A. Irvine
 */
public class A366717 extends Sequence1 {

  private final Sequence mA = new A024140().skip();

  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(mA.next());
  }
}
