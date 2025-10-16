package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081222 Smallest number m with Sum_{k=n..n+m} mu(k) = 0, where mu=A008683 (M\u00f6bius function).
 * @author Sean A. Irvine
 */
public class A081222 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long sum = Functions.MOBIUS.l(m);
    while (sum != 0) {
      sum += Functions.MOBIUS.l(++m);
    }
    return Z.valueOf(m - mN);
  }
}
