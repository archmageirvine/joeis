package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392735 Triangle read by rows: T(n,k) = f(n,k,2) where f(n,k,m) = Sum_{j=k-1..n-1} binomial(n,j) * f(j+1,k,m-1) with f(n,k,0) = [n = k].
 * @author Sean A. Irvine
 */
public class A392735 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Integers.SINGLETON.sum(mM, mN, j -> Functions.STIRLING1.z(j, mM).multiply(Functions.STIRLING2.z(mN, j).multiply((long) j * j))).abs();
  }
}

