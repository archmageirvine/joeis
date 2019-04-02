package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001764 a(n) = binomial(3n,n)/(2n+1) (enumerates ternary trees and also noncrossing trees).
 * @author Sean A. Irvine
 */
public class A001764 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(3 * mN, mN).divide(2 * mN + 1);
  }
}
