package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004328 Binomial coefficient C(3n,n-10).
 * @author Sean A. Irvine
 */
public class A004328 extends AbstractSequence {

  /* Construct the sequence. */
  public A004328() {
    super(10);
  }

  private long mN = 9;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN, mN - 10);
  }
}

