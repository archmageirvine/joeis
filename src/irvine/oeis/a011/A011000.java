package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A011000 a(n) = binomial coefficient C(n, 47).
 * @author Sean A. Irvine
 */
public class A011000 extends AbstractSequence {

  /** Construct the sequence. */
  public A011000() {
    super(47);
  }

  private long mN = 46;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 47);
  }
}

