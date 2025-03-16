package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076028 Final members of groups in A076031.
 * @author Sean A. Irvine
 */
public class A076028 extends A076031 {

  @Override
  public Z next() {
    step();
    return mA.get(mA.size() - 1);
  }
}
