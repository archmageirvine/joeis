package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010968 a(n) = binomial(n, 15).
 * @author Sean A. Irvine
 */
public class A010968 extends AbstractSequence {

  /** Construct the sequence. */
  public A010968() {
    super(15);
  }

  private long mN = 14;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 15);
  }
}

