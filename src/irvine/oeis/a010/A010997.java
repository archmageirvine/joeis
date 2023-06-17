package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010997 a(n) = binomial coefficient C(n, 44).
 * @author Sean A. Irvine
 */
public class A010997 extends AbstractSequence {

  /* Construct the sequence. */
  public A010997() {
    super(44);
  }

  private long mN = 43;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 44);
  }
}

