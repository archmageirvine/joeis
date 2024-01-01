package irvine.oeis.a067;

import irvine.math.factorial.BinarySplitFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067669 a(n)=(5^n)!/5^(floor(5^n/4)).
 * @author Sean A. Irvine
 */
public class A067669 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.FIVE.pow(++mN);
    final Z f = new BinarySplitFactorial().factorial(t.intValueExact());
    return f.divide(Z.FIVE.pow(t.divide2()));
  }
}
