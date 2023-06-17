package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010988 Binomial coefficient C(n,35).
 * @author Sean A. Irvine
 */
public class A010988 extends AbstractSequence {

  /** Construct the sequence. */
  public A010988() {
    super(35);
  }

  private long mN = 34;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 35);
  }
}

