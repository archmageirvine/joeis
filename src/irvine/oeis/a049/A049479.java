package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049479 Smallest prime dividing 2^n - 1.
 * @author Sean A. Irvine
 */
public class A049479 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Z[] p = Jaguar.factor(Z.ONE.shiftLeft(mN).subtract(1)).toZArray();
    return p[0];
  }
}
