package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004392 Binomial coefficient C(8n,n-11).
 * @author Sean A. Irvine
 */
public class A004392 extends AbstractSequence {

  /** Construct the sequence. */
  public A004392() {
    super(11);
  }

  private long mN = 10;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 11);
  }
}

