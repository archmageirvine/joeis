package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010991 Binomial coefficient C(n, 38).
 * @author Sean A. Irvine
 */
public class A010991 extends AbstractSequence {

  /** Construct the sequence. */
  public A010991() {
    super(38);
  }

  private long mN = 37;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 38);
  }
}

