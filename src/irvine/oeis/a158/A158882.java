package irvine.oeis.a158;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a003.A003319;

/**
 * A158882 G.f. A(x) satisfies: [x^n] A(x)^n = [x^n] A(x)^(n-1) for n&gt;1 with A(0)=A'(0)=1.
 * @author Georg Fischer
 */
public class A158882 extends A003319 implements SequenceWithOffset {

  private int mN = -1;

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? super.next() : (((mN & 1) == 0) ? super.next().negate() : super.next());
  }
}
