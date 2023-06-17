package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004386 Binomial coefficient C(8n,n-5).
 * @author Sean A. Irvine
 */
public class A004386 extends AbstractSequence {

  /* Construct the sequence. */
  public A004386() {
    super(5);
  }

  private long mN = 4;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 5);
  }
}

