package irvine.oeis.a057;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A057553 Rank of (1,1,...,1) (n 1's) when {0,1,2,...}^n is lexicographically ordered.
 * @author Sean A. Irvine
 */
public class A057553 extends A057552 {

  private boolean mFirst = true;

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().add(Binomial.binomial(2L * mN + 3, mN + 2)).add(1);
  }
}
