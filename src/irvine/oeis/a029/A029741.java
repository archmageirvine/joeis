package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a010.A010784;

/**
 * A029741 Even numbers with distinct digits.
 * @author Sean A. Irvine
 */
public class A029741 extends A010784 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t != null && t.isOdd());
    return t;
  }
}
