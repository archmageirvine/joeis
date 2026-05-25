package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A014551 Jacobsthal-Lucas numbers.
 * @author Sean A. Irvine
 */
public class A014551 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Z.TWO.pow(n).add(n.testBit(0) ? -1 : 1);
  }

  @Override
  public Z a(final long n) {
    return Z.ONE.shiftLeft(n).signedAdd((n & 1) == 0, Z.ONE);
  }

}
