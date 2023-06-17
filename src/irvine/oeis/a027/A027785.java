package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027785 a(n) = 6*(n+1)*binomial(n+2,12).
 * @author Sean A. Irvine
 */
public class A027785 extends AbstractSequence {

  /** Construct the sequence. */
  public A027785() {
    super(10);
  }

  private long mN = 10;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 1, 12).multiply(6 * mN);
  }
}
