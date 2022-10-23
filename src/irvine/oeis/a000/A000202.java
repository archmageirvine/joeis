package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000202 a(8i+j) = 13i + a(j), where 1&lt;=j&lt;=8.
 * @author Sean A. Irvine
 */
public class A000202 extends Sequence1 {

  private static final long[] CONST = {-1, 1, 3, 4, 6, 8, 9, 11};

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(13 * (mN >> 3) + CONST[(int) (mN & 7)]);
  }
}
