package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029657 Odd numbers in <code>(2,1)-Pascal</code> triangle <code>A029653</code> that are different from 1.
 * @author Sean A. Irvine
 */
public class A029657 extends A029656 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t;
  }
}
