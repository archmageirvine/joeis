package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068774 Number of strings over Z_4 of length n with trace 0 and subtrace 2.
 * @author Sean A. Irvine
 */
public class A068774 extends A068596 {

  private int mN = 0;

  @Override
  public Z next() {
    return s(++mN, 4, 0, 2);
  }
}
