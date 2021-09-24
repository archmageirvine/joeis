package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051675 "Second factorials": Product_{k=1..n} k^(k^2).
 * @author Sean A. Irvine
 */
public class A051675 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA.multiply(Z.valueOf(++mN).pow(mN * mN));
    return mA;
  }
}
