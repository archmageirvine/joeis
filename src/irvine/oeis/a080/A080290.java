package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080290 a(n)=n^n(n+2-(1/12)(n^2-1)).
 * @author Sean A. Irvine
 */
public class A080290 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN).multiply(12 * mN + 25 - mN * mN).divide(12);
  }
}

