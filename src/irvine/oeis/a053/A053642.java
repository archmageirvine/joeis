package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053642 Rotate one binary digit to the left, calculate, then rotate one binary digit to the right.
 * @author Georg Fischer
 */
public class A053642 implements Sequence {

  protected long mN = 0L;

  @Override
  public Z next() {
    ++mN;
    long result = mN << 1;
    result = (result ^ Long.highestOneBit(result)) | 1L; // clear the highest bit, and OR it in position 0
    final long hb = Long.highestOneBit(result);
    result = (result >> 1) | hb;
    return Z.valueOf(result);
  }
}
