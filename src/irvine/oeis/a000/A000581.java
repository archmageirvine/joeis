package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000581 a(n) = binomial coefficient C(n,8).
 * @author Sean A. Irvine
 */
public class A000581 extends AbstractSequence {

  /** Construct the sequence. */
  public A000581() {
    super(8);
  }

  private int mN = 7;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 8);
  }
}

