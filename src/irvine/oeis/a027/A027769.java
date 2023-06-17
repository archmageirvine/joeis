package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027769 a(n) = (n+1)*binomial(n+1, 9).
 * @author Sean A. Irvine
 */
public class A027769 extends AbstractSequence {

  /** Construct the sequence. */
  public A027769() {
    super(8);
  }

  private long mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 9).multiply(mN);
  }
}
