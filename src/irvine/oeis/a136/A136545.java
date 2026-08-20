package irvine.oeis.a136;

import irvine.math.cr.CR;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A136545 a(n) = Sum_{k=1..floor(n*log(2))} (1 - (n - floor(n/2^k)) * (n - floor(n/2^(k - 1))) mod 2).
 * @author Sean A. Irvine
 */
public class A136545 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, CR.LOG2.multiply(++mN).floor().longValueExact(),
      k -> Z.valueOf((1 - (mN - mN / (1L << k)) * (mN - mN / (1L << (k - 1)))) & 1));
  }
}
