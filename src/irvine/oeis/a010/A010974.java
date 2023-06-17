package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010974 a(n) = binomial(n,21).
 * @author Sean A. Irvine
 */
public class A010974 extends AbstractSequence {

  /** Construct the sequence. */
  public A010974() {
    super(21);
  }

  private long mN = 20;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 21);
  }
}

