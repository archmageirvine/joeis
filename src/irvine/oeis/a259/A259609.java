package irvine.oeis.a259;
//manually 2025-06-16

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A259609 G.f. A(x) satisfies: A'(x)/2 = Series_Reversion( x - x^2*A'(x) - 2*x*A(x) ).
 * @author Georg Fischer
 */
public class A259609 extends Sequence2 {

  private int mK = 0;
  private A259608 mSeq = new A259608();

  @Override
  public Z next() {
    ++mK;
    if (mK == 1) {
      mSeq.next();
      return Z.ONE;
    }
    return mSeq.next().divide(mK);
  }
}
