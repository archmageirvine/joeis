package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004390 Binomial coefficient C(8n,n-9).
 * @author Sean A. Irvine
 */
public class A004390 extends AbstractSequence {

  /** Construct the sequence. */
  public A004390() {
    super(9);
  }

  private long mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 9);
  }
}

