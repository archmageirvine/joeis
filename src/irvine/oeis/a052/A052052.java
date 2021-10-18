package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052052 Cubes whose digits occur with an equal minimal frequency of 2.
 * @author Sean A. Irvine
 */
public class A052052 extends A052051 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
