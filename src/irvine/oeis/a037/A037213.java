package irvine.oeis.a037;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037213 Expansion of Sum_{n&gt;=0} n*q^(n^2).
 * @author Sean A. Irvine
 */
public class A037213 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long s = LongUtils.sqrt(++mN);
    return s * s == mN ? Z.valueOf(s) : Z.ZERO;
  }
}
