package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002420 Expansion of sqrt(1 - 4*x) in powers of x.
 * @author Sean A. Irvine
 */
public class A002420 extends AbstractSequence {

  /** Construct the sequence. */
  public A002420() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN).divide(1 - 2 * mN);
  }
}

