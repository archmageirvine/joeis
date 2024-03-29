package irvine.oeis.a351;
// Generated by gen_seq4.pl simbinom at 2023-03-19 22:22

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A351608 a(n) = n^10 * Sum_{d^2|n} 1 / d^10.
 * @author Georg Fischer
 */
public class A351608 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A351608() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Rationals.SINGLETON.sumdiv(mN, d -> !Z.valueOf(d).isSquare() ? Q.ZERO : new Q(Z.ONE, Z.valueOf(d).sqrt().pow(10))).multiply(Z.valueOf(mN).pow(10)).num();
  }
}
