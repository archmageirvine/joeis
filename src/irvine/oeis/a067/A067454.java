package irvine.oeis.a067;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A067454 Binomial(a,b) where a = n! and b = sum of first n natural numbers.
 * @author Sean A. Irvine
 */
public class A067454 extends A000142 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(super.next(), Z.valueOf(++mN).multiply(mN + 1).divide2());
  }
}
