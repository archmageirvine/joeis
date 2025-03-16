package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076033 Final members of groups in A076034.
 * @author Sean A. Irvine
 */
public class A076033 extends A076034 {

  @Override
  public Z next() {
    step();
    return mA.get(mA.size() - 1);
  }
}
