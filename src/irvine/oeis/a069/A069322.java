package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069322 Square array read by antidiagonals of floor[(n+k)^(n+k)/(n^n*k^k)].
 * @author Sean A. Irvine
 */
public class A069322 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mN).pow(mN).divide(Z.valueOf(mM).pow(mM)).divide(Z.valueOf(mN - mM).pow(mN - mM));
  }
}
