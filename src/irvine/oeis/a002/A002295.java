package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;

/**
 * A002295 Number of dissections of a polygon: <code>binomial(6n,n)/(5n+1)</code>.
 * @author Sean A. Irvine
 */
public class A002295 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(6 * mN, mN).divide(5 * mN + 1);
  }
}
