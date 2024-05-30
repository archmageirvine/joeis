package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057670 a(n) = Sum_{k|n} lcm(k, n/k).
 * @author Sean A. Irvine
 */
public class A057670 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, k -> Functions.LCM.z(k, mN / k));
  }
}
