package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056414 Number of step cyclic shifted sequences using a maximum of six different symbols.
 * @author Sean A. Irvine
 */
public class A056414 extends A056411 {

  private long mN = 0;

  @Override
  public Z next() {
    return cb(++mN, 6);
  }
}
