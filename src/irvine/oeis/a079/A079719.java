package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079719 a(n) = n + floor[sum_k{k&lt;n}a(k)/2] with a(0)=0.
 * @author Sean A. Irvine
 */
public class A079719 extends Sequence0 {

  private Z mSum = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    final Z t = mSum.divide2().add(++mN);
    mSum = mSum.add(t);
    return t;
  }
}

