package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a068.A068596;

/**
 * A073964 Number of strings of length n over Z_5 with trace 0 and subtrace 1.
 * @author Sean A. Irvine
 */
public class A073964 extends A068596 {

  private int mN = 0;

  @Override
  public Z next() {
    return s(++mN, 5, 0, 1);
  }
}
