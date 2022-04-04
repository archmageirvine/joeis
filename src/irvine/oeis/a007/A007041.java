package irvine.oeis.a007;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007041 State assignments for n-state machine.
 * @author Sean A. Irvine
 */
public class A007041 implements Sequence {

  private int mN = 1;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    final int s = IntegerUtils.lg(mN - 1);
    return mF.factorial(1 << s).divide(mF.factorial((1 << s) - mN)).divide(mF.factorial(s));
  }
}
