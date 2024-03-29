package irvine.oeis.a093;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A093505 a(n) = floor(A001969(n)/2 + 1/2).
 * @author Sean A. Irvine
 */
public class A093505 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(((Long.bitCount(mN) & 1) + 2 * ++mN - 1) / 2);
  }
}

