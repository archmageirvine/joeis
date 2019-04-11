package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003091 <code>[ 2^{n(n-1)/2} / n! ]</code>.
 * @author Sean A. Irvine
 */
public class A003091 implements Sequence {

  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return Z.ONE.shiftLeft((mN * mN - mN) / 2).divide(mF);
  }
}
