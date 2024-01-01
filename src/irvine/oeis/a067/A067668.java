package irvine.oeis.a067;

import irvine.math.factorial.BinarySplitFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067633.
 * @author Sean A. Irvine
 */
public class A067668 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.THREE.pow(++mN);
    final Z f = new BinarySplitFactorial().factorial(t.intValueExact());
    return f.divide(Z.THREE.pow(t.divide2()));
  }
}
