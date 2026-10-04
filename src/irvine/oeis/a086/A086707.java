package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086707 Smallest mode of the sequences (n/(n-k)) * binomial(n,n-k).
 * @author Sean A. Irvine
 */
public class A086707 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(5 * mN + 5).subtract(Functions.SQRT.z(5 * mN * mN - 4)).divide(10);
  }
}

