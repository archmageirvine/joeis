package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076102 Final members of groups in A076105.
 * @author Sean A. Irvine
 */
public class A076102 extends A076105 {

  @Override
  public Z next() {
    step();
    return mA.get(mA.size() - 1);
  }
}
