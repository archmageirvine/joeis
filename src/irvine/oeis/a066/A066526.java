package irvine.oeis.a066;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066526 a(n) = binomial(Fibonacci(n), Fibonacci(n-1)).
 * @author Sean A. Irvine
 */
public class A066526 extends Sequence1 {

  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA.add(mB);
    mA = mB;
    mB = t;
    return Binomial.binomial(mB, mA);
  }
}
