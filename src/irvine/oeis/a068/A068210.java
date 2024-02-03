package irvine.oeis.a068;

import irvine.math.factorial.BinarySplitFactorial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068192.
 * @author Sean A. Irvine
 */
public class A068210 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return new BinarySplitFactorial().factorial(p.intValueExact()).pow(p);
  }
}

