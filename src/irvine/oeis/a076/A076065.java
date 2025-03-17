package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076065 Final members of groups in A076063.
 * @author Sean A. Irvine
 */
public class A076065 extends A076063 {

  @Override
  public Z next() {
    step();
    return mA.get(mA.size() - 1);
  }
}
