package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a059.A059366;

/**
 * A001757 Expansion of an integral: central elements of rows of triangle in A059366.
 * @author Sean A. Irvine
 */
public class A001757 extends A059366 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, mN / 2);
  }
}
