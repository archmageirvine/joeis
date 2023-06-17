package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004310 Binomial coefficient C(2n,n-4).
 * @author Sean A. Irvine
 */
public class A004310 extends AbstractSequence {

  /* Construct the sequence. */
  public A004310() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 4);
  }
}

