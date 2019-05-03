package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006088 <code>a(n) = (2^n + 2) a(n-1) (kissing</code> number of Barnes-Wall lattice in dimension <code>2^n)</code>.
 * @author Sean A. Irvine
 */
public class A006088 implements Sequence {

  private Z mA = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(Z.ONE.shiftLeft(mN).add(2));
    }
    return mA;
  }
}

