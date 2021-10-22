package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052094 Smallest fourth powers whose decimal expansion digits occur with same frequency n.
 * @author Sean A. Irvine
 */
public class A052094 extends A052093 {

  @Override
  public Z next() {
    return super.next().pow(4);
  }
}

