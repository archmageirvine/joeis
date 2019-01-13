package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000202.
 * @author Sean A. Irvine
 */
public class A000202 implements Sequence {

  private static final long[] CONST = {-1, 1, 3, 4, 6, 8, 9, 11};

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(13 * (mN >> 3) + CONST[(int) (mN & 7)]);
  }
}
