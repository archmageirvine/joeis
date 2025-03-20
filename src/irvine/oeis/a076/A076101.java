package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076027 Initial members of groups in A076031.
 * @author Sean A. Irvine
 */
public class A076101 extends A076105 {

  @Override
  public Z next() {
    step();
    return mA.get(0);
  }
}
