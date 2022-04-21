package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056412 Number of step cyclic shifted sequences using a maximum of four different symbols.
 * @author Sean A. Irvine
 */
public class A056412 extends A056411 {

  private long mN = 0;

  @Override
  public Z next() {
    return cb(++mN, 4);
  }
}
