package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082022 In the following square array A(i,j) = Least Common Multiple of i and j. Sequence contains the product of the terms of the n-th antidiagonal.
 * @author Sean A. Irvine
 */
public class A082022 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.product(1, ++mN, k -> Functions.LCM.z(k, mN + 1 - k));
  }
}
