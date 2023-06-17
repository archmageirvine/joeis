package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004385 Binomial coefficient C(8n,n-4).
 * @author Sean A. Irvine
 */
public class A004385 extends AbstractSequence {

  /* Construct the sequence. */
  public A004385() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 4);
  }
}

