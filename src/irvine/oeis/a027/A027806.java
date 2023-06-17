package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027806 a(n) = 30*(n+1)*binomial(n+4, 10).
 * @author Sean A. Irvine
 */
public class A027806 extends AbstractSequence {

  /** Construct the sequence. */
  public A027806() {
    super(6);
  }

  private long mN = 6;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 3, 10).multiply(30 * mN);
  }
}
