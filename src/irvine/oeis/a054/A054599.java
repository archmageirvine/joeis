package irvine.oeis.a054;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054599 a(n) = Sum_{d|n} d*2^(n/d - 1).
 * @author Sean A. Irvine
 */
public class A054599 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ZERO : Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf(d).shiftLeft(mN / d - 1));
  }
}
