package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052072 Smallest cubes whose digits occur with the same frequency n.
 * @author Sean A. Irvine
 */
public class A052072 extends A052071 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}

