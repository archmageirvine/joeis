package irvine.oeis.a034;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034841 a(n) = (n^2)! / (n!)^n.
 * @author Sean A. Irvine
 */
public class A034841 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    return mF.factorial(++mN * mN).divide(mF.factorial(mN).pow(mN));
  }
}
