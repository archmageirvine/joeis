package irvine.oeis.a173;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A173781 a(n) is the smallest entry of the n-th column of the matrix of Super Catalan numbers S(m,n).
 * @author Sean A. Irvine
 */
public class A173781 extends Sequence0 {

  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    final int m = (++mN + 2) / 3;
    return F.factorial(2 * mN).divide(F.factorial(mN)).multiply(F.factorial(2 * m).divide(F.factorial(m))).divide(F.factorial(mN + m));
  }
}

