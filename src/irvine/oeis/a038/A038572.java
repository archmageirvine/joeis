package irvine.oeis.a038;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A038572 a(n) = n rotated one binary place to the right.
 * @author Sean A. Irvine
 */
public class A038572 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.rotateRight(++mN));
  }

  @Override
  public Z a(final Z n) {
    final int pos1 = n.bitCount() - 1;
    return n.testBit(0) ? n.shiftRight(1).setBit(pos1) : n.shiftRight(1);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(LongUtils.rotateRight(n));
  }

}
