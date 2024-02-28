package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A074029 Number of binary Lyndon words of length n with trace 1 and subtrace 0 over Z_2.
 * @author Sean A. Irvine
 */
public class A068620 extends A068596 {

  private int mN = 0;

  @Override
  public Z next() {
    return s(++mN, 4, 0, 0);
  }
}
