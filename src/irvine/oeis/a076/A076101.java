package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076101 Initial members of groups in A076105.
 * @author Sean A. Irvine
 */
public class A076101 extends A076105 {

  @Override
  public Z next() {
    step();
    return mA.get(0);
  }
}
