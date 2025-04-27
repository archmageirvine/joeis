package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383213 a(n) = number of distinct prime factors of binomial(2n,n+1).
 * @author Sean A. Irvine
 */
public class A383213 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.OMEGA.z(Binomial.binomial(2 * ++mN, mN + 1));
  }
}

