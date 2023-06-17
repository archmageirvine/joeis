package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010979 Binomial coefficient C(n, 26).
 * @author Sean A. Irvine
 */
public class A010979 extends AbstractSequence {

  /** Construct the sequence. */
  public A010979() {
    super(26);
  }

  private long mN = 25;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 26);
  }
}

