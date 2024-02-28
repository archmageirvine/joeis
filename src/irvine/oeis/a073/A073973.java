package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a068.A068596;

/**
 * A073973 Number of strings of length n over Z_6 with trace 0 and subtrace 2.
 * @author Sean A. Irvine
 */
public class A073973 extends A068596 {

  private int mN = 0;

  @Override
  public Z next() {
    return s(++mN, 6, 0, 2);
  }
}
