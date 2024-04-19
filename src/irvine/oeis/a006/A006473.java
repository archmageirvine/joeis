package irvine.oeis.a006;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A006473 a(n) = binomial(n,2)!/n!.
 * @author Sean A. Irvine
 */
public class A006473 extends Sequence3 {

  private int mN = 2;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    return Functions.FACTORIAL.z(mN * (mN - 1) / 2).divide(Functions.FACTORIAL.z(mN));
  }
}
