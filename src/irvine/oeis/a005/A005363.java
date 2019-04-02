package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005363 Hoggatt sequence.
 * @author Sean A. Irvine
 */
public class A005363 extends A005364 {

  private long mN = -1;

  @Override
  public Z next() {
    return hoggatt(5, ++mN);
  }
}
