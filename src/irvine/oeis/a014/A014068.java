package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A014068 a(n) = binomial(n*(n+1)/2, n).
 * @author Sean A. Irvine
 */
public class A014068 extends AbstractSequence {

  /** Construct the sequence. */
  public A014068() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN * (mN + 1) / 2, mN);
  }
}
