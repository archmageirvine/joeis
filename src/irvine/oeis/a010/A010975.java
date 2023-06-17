package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010975 a(n) = binomial(n,22).
 * @author Sean A. Irvine
 */
public class A010975 extends AbstractSequence {

  /** Construct the sequence. */
  public A010975() {
    super(22);
  }

  private long mN = 21;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 22);
  }
}

