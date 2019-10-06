package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026517.
 * @author Sean A. Irvine
 */
public class A026517 implements Sequence {

  private long mN = -5;

  @Override
  public Z next() {
    mN += 5;
    return Z.valueOf(1 + (Long.bitCount(mN) & 1));
  }
}
