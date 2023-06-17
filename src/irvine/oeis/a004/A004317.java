package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004317 Binomial coefficient C(2n,n-11).
 * @author Sean A. Irvine
 */
public class A004317 extends AbstractSequence {

  /** Construct the sequence. */
  public A004317() {
    super(11);
  }

  private long mN = 10;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 11);
  }
}

