package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061718 a(n) = (n*(n+1)/2)^n.
 * @author Sean A. Irvine
 */
public class A061718 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN * (mN + 1) / 2).pow(mN);
  }
}
