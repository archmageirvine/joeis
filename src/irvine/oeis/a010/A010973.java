package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010973 a(n) = binomial(n, 20).
 * @author Sean A. Irvine
 */
public class A010973 extends AbstractSequence {

  /** Construct the sequence. */
  public A010973() {
    super(20);
  }

  private long mN = 19;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 20);
  }
}

