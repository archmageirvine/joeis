package irvine.oeis.a006;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006150 Number of 4-tuples (p_1, p_2, ..., p_4) of Dyck paths of semilength n, such that each p_i is never below p_{i-1}.
 * @author Sean A. Irvine
 */
public class A006150 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    final int n = 2 * ++mN;
    return Functions.FACTORIAL.z(n)
      .divide(Functions.FACTORIAL.z(mN))
      .multiply(Functions.FACTORIAL.z(2 * mN + 2))
      .divide(Functions.FACTORIAL.z(mN + 1))
      .multiply(Functions.FACTORIAL.z(2 * mN + 4))
      .divide(Functions.FACTORIAL.z(mN + 2))
      .multiply(Functions.FACTORIAL.z(2 * mN + 6))
      .divide(Functions.FACTORIAL.z(mN + 3))
      .multiply(3628800)
      .divide(Functions.FACTORIAL.z(mN + 7))
      .divide(Functions.FACTORIAL.z(mN + 6))
      .divide(Functions.FACTORIAL.z(mN + 5))
      .divide(Functions.FACTORIAL.z(mN + 4));
  }
}

