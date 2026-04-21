package irvine.oeis.a174;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a087.A087655;

/**
 * A174218 An absolute difference sequence based on A087655: a(n)=If[Mod[A087655(n), 3] == 1, a(n - 1) - (-1)^n*n, a(n - 1) + (-1)^n*n].
 * @author Sean A. Irvine
 */
public class A174218 extends Sequence0 {

  private final A087655 mA = new A087655();
  private long mN = -1;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    mPrev = mPrev.add(Z.NEG_ONE.pow(mN + (mA.a(mN).mod(3) == 1 ? 1 : 0)).multiply(mN));
    return mPrev;
  }
}

