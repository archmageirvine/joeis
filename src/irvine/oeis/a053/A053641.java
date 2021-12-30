package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053641 Rotate one binary digit to the right, calculate, then rotate one binary digit to the left.
 * @author Georg Fischer
 */
public class A053641 implements Sequence {

  protected long mN = 0L;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1L) == 1L) { // odd
      return Z.valueOf(mN);
    } else { // even
      final long result = mN >> 1;
      return Z.valueOf(((result ^ Long.highestOneBit(result)) << 1) | 1L);
    }
  }
}
