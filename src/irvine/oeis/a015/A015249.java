package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015249 Gaussian binomial coefficient [ n,2 ] for q = -2.
 * @author Sean A. Irvine
 */
public class A015249 implements Sequence {

  private Z mQ = Z.valueOf(q()).square();

  protected long q() {
    return -2;
  }

  @Override
  public Z next() {
    Z num = mQ;
    mQ = mQ.multiply(q());
    Z den = Z.valueOf(q());
    final Z p = num.subtract(1).divide(den.subtract(1));
    den = den.multiply(q());
    num = num.divide(q());
    return p.multiply(num.subtract(1)).divide(den.subtract(1));
  }
}
