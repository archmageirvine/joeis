package irvine.oeis.a306;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A306958 If the decimal expansion of n is d_1 ... d_k, a(n) = Sum d_i!*binomial(10,d_i).
 * @author Georg Fischer
 */
public class A306958 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A306958() {
    super(0);
    mN = -1;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    Z sum = Z.ZERO;
    final String s = n.toString();
    for (int i = 0; i < s.length(); ++i) {
      final int digit = s.charAt(i) - '0';
      sum = sum.add(MemoryFactorial.SINGLETON.factorial(digit).multiply(Binomial.binomial(10, digit)));
    }
    return sum;
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
