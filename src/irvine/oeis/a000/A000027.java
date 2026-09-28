package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A000027 The positive integers. Also called the natural numbers, the whole numbers or the counting numbers, but these terms are ambiguous.
 * @author Sean A. Irvine
 */
public class A000027 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN);
  }

  @Override
  public Z a(final Z n) {
    return n;
  }

  @Override
  public Z a(final long n) {
    return Z.valueOf(n);
  }

}

