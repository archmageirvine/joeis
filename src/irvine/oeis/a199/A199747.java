package irvine.oeis.a199;
// Generated by gen_seq4.pl simbinom at 2023-03-16 19:20

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A199747 a(n) = binomial(n*(3*n+1)/2, n).
 * @author Georg Fischer
 */
public class A199747 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A199747() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN * (3L * mN + 1) / 2, mN);
  }
}
