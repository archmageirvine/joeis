package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A011371 a(n) = n minus (number of 1's in binary expansion of n). Also highest power of 2 dividing n!.
 * @author Sean A. Irvine
 */
public class A011371 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN - (long) Long.bitCount(mN));
  }

  @Override
  public Z a(final Z n) {
    return n.subtract(n.bitCount());
  }

  @Override
  public Z a(final long n) {
    return Z.valueOf(n - (long) Long.bitCount(n));
  }

}

