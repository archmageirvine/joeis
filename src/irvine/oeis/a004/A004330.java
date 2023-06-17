package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004330 Binomial coefficient C(3n,n-12).
 * @author Sean A. Irvine
 */
public class A004330 extends AbstractSequence {

  /* Construct the sequence. */
  public A004330() {
    super(12);
  }

  private long mN = 11;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN, mN - 12);
  }
}

