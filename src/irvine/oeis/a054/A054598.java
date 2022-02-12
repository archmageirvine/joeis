package irvine.oeis.a054;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054598 a(0)=0; for n&gt;0, a(n) = Sum_{d|n} d*2^(n/d).
 * @author Sean A. Irvine
 */
public class A054598 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ZERO : Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf(d).shiftLeft(mN / d));
  }
}
