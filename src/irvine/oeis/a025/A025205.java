package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025205 a(n) = floor(Sum_{k=2..n} log(k)^2).
 * @author Sean A. Irvine
 */
public class A025205 implements Sequence {

  private CR mSum = CR.ZERO;
  private long mN = 1;

  @Override
  public Z next() {
    final CR l = CR.valueOf(++mN).log();
    mSum = mSum.add(l.multiply(l));
    return mSum.floor();
  }
}
