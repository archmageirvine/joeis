package irvine.oeis.a007;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007746 Number of ways for n-3 nonintersecting loops to cross a line 2n times.
 * @author Sean A. Irvine
 */
public class A007746 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 3;

  @Override
  public Z next() {
    ++mN;
    final Z a = Z.valueOf(mN).add(20).multiply(mN).add(107).multiply(mN).subtract(107).multiply(mN).add(15);
    return a.multiply(mF.factorial(2 * mN)).divide(3).divide(mF.factorial(mN - 4)).shiftLeft(2).divide(mF.factorial(mN + 6));
  }
}

