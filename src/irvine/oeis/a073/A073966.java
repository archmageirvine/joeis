package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a068.A068596;

/**
 * A073966 Number of strings of length n over Z_5 with trace 1 and subtrace 0.
 * @author Sean A. Irvine
 */
public class A073966 extends A068596 {

  private int mN = 0;

  @Override
  public Z next() {
    return s(++mN, 5, 1, 0);
  }
}
