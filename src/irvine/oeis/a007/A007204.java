package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a001.A001844;

/**
 * A007204.
 * @author Sean A. Irvine
 */
public class A007204 extends A001844 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

