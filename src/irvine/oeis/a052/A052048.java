package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052048 Cubes whose digits occur with the same frequency.
 * @author Sean A. Irvine
 */
public class A052048 extends A052047 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}

