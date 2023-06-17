package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A015305 Gaussian binomial coefficient [ n, 5 ] for q = -2.
 * @author Sean A. Irvine
 */
public class A015305 extends AbstractSequence {

  /* Construct the sequence. */
  public A015305() {
    super(5);
  }

  private Z mQ = Z.valueOf(q()).square().square().multiply(q());

  protected long q() {
    return -2;
  }

  @Override
  public Z next() {
    Z num = mQ;
    mQ = mQ.multiply(q());
    Z den = Z.valueOf(q());
    Z p = num.subtract(1).divide(den.subtract(1));
    for (int k = 0; k < 4; ++k) {
      den = den.multiply(q());
      num = num.divide(q());
      p = p.multiply(num.subtract(1)).divide(den.subtract(1));
    }
    return p;
  }
}
