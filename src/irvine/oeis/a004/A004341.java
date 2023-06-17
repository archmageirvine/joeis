package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004341 Binomial coefficient C(4n,n-11).
 * @author Sean A. Irvine
 */
public class A004341 extends AbstractSequence {

  /** Construct the sequence. */
  public A004341() {
    super(11);
  }

  private long mN = 10;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 11);
  }
}

