package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004334 Binomial coefficient C(4n,n-4).
 * @author Sean A. Irvine
 */
public class A004334 extends AbstractSequence {

  /** Construct the sequence. */
  public A004334() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 4);
  }
}

