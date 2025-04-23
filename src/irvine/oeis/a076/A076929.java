package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076929 a(1) = 1, a(n+1)= a(n)*(n+1) divided by the smallest prime divisor of n+1.
 * @author Sean A. Irvine
 */
public class A076929 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA.multiply(++mN / Functions.LPF.l(mN));
    return mA;
  }
}

