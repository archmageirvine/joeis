package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010987 Binomial coefficient C(n,34).
 * @author Sean A. Irvine
 */
public class A010987 extends AbstractSequence {

  /** Construct the sequence. */
  public A010987() {
    super(34);
  }

  private long mN = 33;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 34);
  }
}

