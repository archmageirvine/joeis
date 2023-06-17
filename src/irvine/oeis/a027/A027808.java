package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027808 a(n) = 55*(n+1)*binomial(n+4,12).
 * @author Sean A. Irvine
 */
public class A027808 extends AbstractSequence {

  /** Construct the sequence. */
  public A027808() {
    super(8);
  }

  private long mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 3, 12).multiply(55 * mN);
  }
}
