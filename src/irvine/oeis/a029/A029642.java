package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029642 Distinct odd numbers in the <code>(1,2)-Pascal</code> triangle <code>A029635</code>.
 * @author Sean A. Irvine
 */
public class A029642 extends A029636 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t;
  }
}
