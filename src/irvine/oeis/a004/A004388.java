package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004388 Binomial coefficient C(8n,n-7).
 * @author Sean A. Irvine
 */
public class A004388 extends AbstractSequence {

  /* Construct the sequence. */
  public A004388() {
    super(7);
  }

  private long mN = 6;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 7);
  }
}

