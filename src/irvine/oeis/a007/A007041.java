package irvine.oeis.a007;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A007041 State assignments for n-state machine.
 * @author Sean A. Irvine
 */
public class A007041 extends Sequence2 {

  private int mN = 1;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    final int s = IntegerUtils.log2(mN - 1);
    return Functions.FACTORIAL.z(1 << s).divide(Functions.FACTORIAL.z((1 << s) - mN)).divide(Functions.FACTORIAL.z(s));
  }
}
