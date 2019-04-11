package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007310 Numbers congruent to 1 or <code>5 mod 6</code>.
 * @author Sean A. Irvine
 */
public class A007310 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(3L * ++mN - 1 - (mN & 1));
  }
}
