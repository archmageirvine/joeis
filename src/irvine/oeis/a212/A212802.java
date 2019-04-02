package irvine.oeis.a212;

import irvine.math.z.Z;

/**
 * A212802 Row 5 of array in A212801.
 * @author Sean A. Irvine
 */
public class A212802 extends A212801 {

  private long mN = 0;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}
