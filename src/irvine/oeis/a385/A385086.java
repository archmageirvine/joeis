package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A385086 a(n) = 2 * (5*n+2)^(n-1).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A385086 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(5 * mN + 2).pow(mN - 1).multiply2();
  }
}
