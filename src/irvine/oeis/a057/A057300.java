package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057300 Binary counter with odd/even bit positions swapped; base-4 counter with 1's replaced by 2's and vice versa.
 * @author Sean A. Irvine
 */
public class A057300 extends Sequence0 {

  private static final long MASK_A = 0b0101010101010101010101010101010101010101010101010101010101010101L;
  private static final long MASK_B = 0b1010101010101010101010101010101010101010101010101010101010101010L;
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(((mN << 1) & MASK_B) | ((mN >>> 1) & MASK_A));
  }
}
