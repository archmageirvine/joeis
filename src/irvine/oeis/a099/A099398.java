package irvine.oeis.a099;
// manually simple/simbinom at 2023-03-20 17:26

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A099398 Numerators of rationals (in lowest terms) used in a certain high temperature expansion.
 * <code>a(n) = numerator(A(n)) with A(n):= Catalan(n)/((n+2)*2^(2*n-1))</code>
 * @author Georg Fischer
 */
public class A099398 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A099398() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return new Q(Binomial.catalan(mN), (mN == 0) ? Z.ONE : Z.ONE.shiftLeft(2L * mN - 1).multiply(mN + 2)).num();
  }
}
