package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001764 a(n) = binomial(3*n,n)/(2*n+1) (enumerates ternary trees and also noncrossing trees).
 * @author Sean A. Irvine
 */
public class A001764 extends AbstractSequence {

  /** Construct the sequence. */
  public A001764() {
    super(0);
  }

  private long mN = -1;

  protected Z a1764(final long n) {
    return Binomial.binomial(3 * n, n).divide(2 * n + 1);
  }

  @Override
  public Z next() {
    return a1764(++mN);
  }
}
