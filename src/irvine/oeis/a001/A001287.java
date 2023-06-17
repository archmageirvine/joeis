package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001287 a(n) = binomial coefficient C(n,10).
 * @author Sean A. Irvine
 */
public class A001287 extends AbstractSequence {

  /** Construct the sequence. */
  public A001287() {
    super(10);
  }

  private long mN = 9;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 10);
  }
}
