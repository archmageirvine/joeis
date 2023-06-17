package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004393 Binomial coefficient C(8n,n-12).
 * @author Sean A. Irvine
 */
public class A004393 extends AbstractSequence {

  /* Construct the sequence. */
  public A004393() {
    super(12);
  }

  private long mN = 11;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 12);
  }
}

