package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a003.A003319;

/**
 * A167894 Expansion of g.f.: 1/(Sum_{k &gt;= 0} k!*x^k).
 * @author Georg Fischer
 */
public class A167894 extends A003319 implements SequenceWithOffset {

  private int mN = -1;

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? super.next() : super.next().negate();
  }
}
