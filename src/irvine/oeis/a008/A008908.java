package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a006.A006577;

/**
 * A008908 (1 + number of halving and tripling steps to reach 1 in the Collatz (3x+1) problem), or -1 if 1 is never reached.
 * @author Sean A. Irvine
 */
public class A008908 extends AbstractSequence implements DirectSequence {

  private int mN = 0;
  private static final DirectSequence A006577 = new A006577();

  /** Construct the sequence. */
  public A008908() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return A006577.a(n).add(1);
  }

  @Override
  public Z a(final int n) {
    return A006577.a(n).add(1);
  }

}
