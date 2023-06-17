package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004353 Binomial coefficient C(5n,n-11).
 * @author Sean A. Irvine
 */
public class A004353 extends AbstractSequence {

  /** Construct the sequence. */
  public A004353() {
    super(11);
  }

  private long mN = 10;

  @Override
  public Z next() {
    return Binomial.binomial(5 * ++mN, mN - 11);
  }
}

