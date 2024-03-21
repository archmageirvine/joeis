package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A003602 Kimberling's paraphrases: if n = (2k-1)*2^m then a(n) = k.
 * @author Sean A. Irvine
 */
public class A003602 extends Sequence1 implements DirectSequence {

  private Z mN = Z.ZERO;

  @Override
  public Z a(final Z n) {
    return n.makeOdd().add(1).divide2();
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.makeOdd().add(1).divide2();
  }
}
