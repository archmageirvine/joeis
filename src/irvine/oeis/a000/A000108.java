package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000108 Catalan numbers: <code>C(n) = binomial(2n,n)/(n+1) = (2n)!/(n!(n+1)!).</code> Also called Segner numbers.
 * @author Sean A. Irvine
 */
public class A000108 implements Sequence {

  protected long mN = -1;
  private Z mC = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mC = mC.multiply2().multiply(2 * mN - 1).divide(mN);
    return mC.divide(mN + 1);
  }
}

