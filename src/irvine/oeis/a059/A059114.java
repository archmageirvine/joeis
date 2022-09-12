package irvine.oeis.a059;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059114 Triangle T(n,m)= Sum_{i=0..n} L'(n,i)*Product_{j=1..m} (i-j+1), read by rows.
 * @author Sean A. Irvine
 */
public class A059114 implements Sequence {

  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    final Z t = F.factorial(mN);
    return Integers.SINGLETON.sum(0, mN,
      k -> t.multiply(Binomial.binomial(k, mM)).multiply(Binomial.binomial(mN - 1, k - 1)).divide(F.factorial(k))
    ).multiply(F.factorial(mM));
  }
}

