package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076096 Final terms of rows in A076099.
 * @author Sean A. Irvine
 */
public class A076096 extends A076099 {

  @Override
  public Z next() {
    step();
    return mA.get(mA.size() - 1);
  }
}
