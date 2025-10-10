package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A387217 The smallest prime factor of (10*n + 5)^4 + 4^(10*n + 5).
 * @author Sean A. Irvine
 */
public class A387217 extends Sequence0 {

  private long mN = -5;

  @Override
  public Z next() {
    mN += 10;
    return Functions.LPF.z(Z.ONE.shiftLeft(2 * mN).add(Z.valueOf(mN).pow(4)));
  }
}
