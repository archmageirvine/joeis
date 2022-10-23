package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057827 a(0) = 1; a(n) = LCM(n, sum{k=0 to n-1}[a(k)]).
 * @author Sean A. Irvine
 */
public class A057827 extends Sequence0 {

  private Z mN = Z.NEG_ONE;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z t = mN.isZero() ? Z.ONE : mN.lcm(mSum);
    mSum = mSum.add(t);
    return t;
  }
}
