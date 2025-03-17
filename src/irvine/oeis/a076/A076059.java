package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076059 Final members of groups in A076062.
 * @author Sean A. Irvine
 */
public class A076059 extends A076062 {

  @Override
  public Z next() {
    step();
    return mA.get(mA.size() - 1);
  }
}
