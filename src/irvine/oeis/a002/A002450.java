package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002450 <code>a(n) = (4^n - 1)/3</code>.
 * @author Sean A. Irvine
 */
public class A002450 implements Sequence {

  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return Z.ONE.shiftLeft(mN).subtract(Z.ONE).divide(Z.THREE);
  }
}
