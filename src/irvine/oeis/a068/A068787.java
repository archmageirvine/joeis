package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068787 Number of strings over Z_4 of length n with trace 1 and subtrace 2.
 * @author Sean A. Irvine
 */
public class A068787 extends A068596 {

  private int mN = 0;

  @Override
  public Z next() {
    return s(++mN, 4, 1, 2);
  }
}
