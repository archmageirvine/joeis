package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014628 Number of segments (and sides) created by diagonals of <code>an</code> n-gon in general position.
 * @author Sean A. Irvine
 */
public class A014628 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 2).add(Binomial.binomial(mN, 4).multiply2());
  }
}
