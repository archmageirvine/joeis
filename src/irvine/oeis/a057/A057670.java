package irvine.oeis.a057;

import irvine.math.IntegerUtils;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057670 a(n) = Sum_{k|n} lcm(k, n/k).
 * @author Sean A. Irvine
 */
public class A057670 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, k -> Z.valueOf(IntegerUtils.lcm(k, mN / k)));
  }
}
