package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062023 a(n) = (n^(n+1) + n^(n-1))/2.
 * @author Sean A. Irvine
 */
public class A062023 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.pow(mN + 1).add(n.pow(mN - 1)).divide2();
  }
}
