package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;

/**
 * A002418 4-dimensional figurate numbers: <code>(5*n-1)*binomial(n+2,3)/4</code>.
 * @author Sean A. Irvine
 */
public class A002418 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 2, 3).multiply(5 * mN - 1).divide(4);
  }
}
