package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A015323 Gaussian binomial coefficient [ n,6 ] for q = -2.
 * @author Sean A. Irvine
 */
public class A015323 extends AbstractSequence {

  /** Construct the sequence. */
  public A015323() {
    super(6);
  }

  private Z mQ = Z.valueOf(q()).pow(p());

  protected long q() {
    return -2;
  }

  protected int p() {
    return 6;
  }

  @Override
  public Z next() {
    Z num = mQ;
    mQ = mQ.multiply(q());
    Z den = Z.valueOf(q());
    Z p = num.subtract(1).divide(den.subtract(1));
    for (int k = 1; k < p(); ++k) {
      den = den.multiply(q());
      num = num.divide(q());
      p = p.multiply(num.subtract(1)).divide(den.subtract(1));
    }
    return p;
  }
}
