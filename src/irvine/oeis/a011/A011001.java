package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A011001 Binomial coefficient C(n, 48).
 * @author Sean A. Irvine
 */
public class A011001 extends AbstractSequence {

  /** Construct the sequence. */
  public A011001() {
    super(48);
  }

  private long mN = 47;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 48);
  }
}

