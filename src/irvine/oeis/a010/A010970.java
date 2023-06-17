package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010970 a(n) = binomial(n,17).
 * @author Sean A. Irvine
 */
public class A010970 extends AbstractSequence {

  /** Construct the sequence. */
  public A010970() {
    super(17);
  }

  private long mN = 16;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 17);
  }
}

