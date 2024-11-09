package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a007.A007294;

/**
 * A072964 Number of partitions of n-th triangular number n(n+1)/2 (A000217(n)) into triangular parts.
 * @author Sean A. Irvine
 */
public class A072964 extends A007294 {

  private int mN = -1;

  @Override
  public Z next() {
    return a(Functions.TRIANGULAR.i(++mN));
  }
}

