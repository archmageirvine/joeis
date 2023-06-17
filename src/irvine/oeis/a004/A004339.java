package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004339 Binomial coefficient C(4n,n-9).
 * @author Sean A. Irvine
 */
public class A004339 extends AbstractSequence {

  /* Construct the sequence. */
  public A004339() {
    super(9);
  }

  private long mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 9);
  }
}

