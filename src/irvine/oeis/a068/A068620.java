package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068620 Number of strings over Z_4 of length n with trace 0 and subtrace 0.
 * @author Sean A. Irvine
 */
public class A068620 extends A068596 {

  private int mN = 0;

  @Override
  public Z next() {
    return s(++mN, 4, 0, 0);
  }
}
