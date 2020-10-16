package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035521 Fifth column of triangle A035342; related to A035330.
 * @author Sean A. Irvine
 */
public class A035521 extends A035342 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}

