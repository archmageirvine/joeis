package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035520 Fourth column of triangle A035342; related to A045894.
 * @author Sean A. Irvine
 */
public class A035520 extends A035342 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}

