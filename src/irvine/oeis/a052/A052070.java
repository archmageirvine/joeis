package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052070 Smallest square all of whose digits occur with the same frequency n.
 * @author Sean A. Irvine
 */
public class A052070 extends A052069 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

