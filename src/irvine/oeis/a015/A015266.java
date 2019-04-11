package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015266 Gaussian binomial coefficient <code>[ n,3 ]</code> for q <code>= -2</code>.
 * @author Sean A. Irvine
 */
public class A015266 implements Sequence {

  private Z mQ = Z.valueOf(q()).square().multiply(q());

  protected long q() {
    return -2;
  }

  @Override
  public Z next() {
    Z num = mQ;
    mQ = mQ.multiply(q());
    Z den = Z.valueOf(q());
    Z p = num.subtract(1).divide(den.subtract(1));
    for (int k = 0; k < 2; ++k) {
      den = den.multiply(q());
      num = num.divide(q());
      p = p.multiply(num.subtract(1)).divide(den.subtract(1));
    }
    return p;
  }
}
