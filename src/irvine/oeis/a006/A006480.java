package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006480 De Bruijn's S(3,n): <code>(3n)!/(n!)^3</code>.
 * @author Sean A. Irvine
 */
public class A006480 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN).multiply(Binomial.binomial(3 * mN, mN));
  }
}
