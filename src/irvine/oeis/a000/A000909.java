package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000909 <code>a(n) = (2n)!(2n+1)! / n!^2</code>.
 * @author Sean A. Irvine
 */
public class A000909 implements Sequence {

  private long mN = -2;
  private Z mS = Z.ONE;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mS = mS.multiply(2 * mN + 1).multiply(2 * mN + 3).shiftLeft(2);
    }
    return mS;
  }
}

