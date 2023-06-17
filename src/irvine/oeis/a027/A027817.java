package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027817 a(n) = 99*(n+1)*binomial(n+5, 12).
 * @author Sean A. Irvine
 */
public class A027817 extends AbstractSequence {

  /** Construct the sequence. */
  public A027817() {
    super(7);
  }

  private long mN = 7;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 4, 12).multiply(99 * mN);
  }
}
