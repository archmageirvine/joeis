package irvine.oeis.a053;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053042 a(n) = n^n + n!.
 * @author Georg Fischer
 */
public class A053042 extends Sequence1 {

  private int mN = 0;
  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN).add(Functions.FACTORIAL.z(mN));
  }
}
