package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053644 Most significant bit of n, msb(n); largest power of 2 less than or equal to n; write n in binary and change all but the first digit to zero.
 * @author Georg Fischer
 */
public class A053644 implements Sequence {

  protected long mN = -1L;

  @Override
  public Z next() {
    return Z.valueOf(Long.highestOneBit(++mN));
  }
}
