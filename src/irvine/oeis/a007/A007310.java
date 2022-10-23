package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007310 Numbers congruent to 1 or 5 mod 6.
 * @author Sean A. Irvine
 */
public class A007310 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(3L * ++mN - 1 - (mN & 1));
  }
}
