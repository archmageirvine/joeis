package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080291 a(n) = (-1)^(n+1) * n^n * (n + (1/12) * (n^2-1)).
 * @author Sean A. Irvine
 */
public class A080291 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN).multiply(12 * mN - 1 + mN * mN).divide(12).multiply(Z.NEG_ONE.pow(mN + 1));
  }
}

