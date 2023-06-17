package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010972 a(n) = binomial(n, 19).
 * @author Sean A. Irvine
 */
public class A010972 extends AbstractSequence {

  /** Construct the sequence. */
  public A010972() {
    super(19);
  }

  private long mN = 18;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 19);
  }
}

