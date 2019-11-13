package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001764 <code>a(n) = binomial(3n,n)/(2n+1)</code> (enumerates ternary trees and also noncrossing trees).
 * @author Sean A. Irvine
 */
public class A001764 implements Sequence {

  private long mN = -1;

  protected Z a1764(final long n) {
    return Binomial.binomial(3 * n, n).divide(2 * n + 1);
  }

  @Override
  public Z next() {
    return a1764(++mN);
  }
}
