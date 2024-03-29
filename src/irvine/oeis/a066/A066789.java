package irvine.oeis.a066;
// Generated by gen_seq4.pl simbinom at 2023-03-16 19:20

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A066789 a(n) = binomial(n^3, n^2).
 * @author Georg Fischer
 */
public class A066789 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A066789() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial((long) mN * mN * mN, (long) mN * mN);
  }
}
