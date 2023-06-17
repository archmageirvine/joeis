package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010965 a(n) = binomial(n, 12).
 * @author Sean A. Irvine
 */
public class A010965 extends AbstractSequence {

  /** Construct the sequence. */
  public A010965() {
    super(12);
  }

  private long mN = 11;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 12);
  }
}

