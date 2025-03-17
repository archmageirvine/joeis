package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076064 Initial members of groups in A076063.
 * @author Sean A. Irvine
 */
public class A076064 extends A076063 {

  @Override
  public Z next() {
    step();
    return mA.get(0);
  }
}
