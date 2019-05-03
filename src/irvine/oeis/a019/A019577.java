package irvine.oeis.a019;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019577 Place n distinguishable balls in n boxes <code>(in n^n ways)</code>; let <code>f(n,k) =</code> number of ways that max in any box is k, for <code>1&lt;=k&lt;=n</code>; sequence gives <code>f(n,2)/n</code>.
 * @author Sean A. Irvine
 */
public class A019577 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final Z m = mF.factorial(mN).multiply(mF.factorial(mN - 1));
    for (int k = 1; k <= mN / 2; ++k) {
      sum = sum.add(m.shiftRight(k).divide(mF.factorial(k).square()).divide(mF.factorial(mN - 2 * k)));
    }
    return sum;
  }
}
