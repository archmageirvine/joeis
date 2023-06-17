package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010969 a(n) = binomial(n,16).
 * @author Sean A. Irvine
 */
public class A010969 extends AbstractSequence {

  /** Construct the sequence. */
  public A010969() {
    super(16);
  }

  private long mN = 15;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 16);
  }
}

