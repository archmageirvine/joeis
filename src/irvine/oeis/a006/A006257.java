package irvine.oeis.a006;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A006257 Josephus problem: a(2*n) = 2*a(n)-1, a(2*n+1) = 2*a(n)+1.
 * @author Sean A. Irvine
 */
public class A006257 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.rotateLeft(++mN));
  }

  @Override
  public Z a(final Z n) {
    final int pos1 = n.bitCount() - 1;
    return n.testBit(pos1) ? n.clearBit(pos1).shiftLeft(1).or(Z.ONE) : n.shiftLeft(1);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(LongUtils.rotateLeft(n));
  }

}
