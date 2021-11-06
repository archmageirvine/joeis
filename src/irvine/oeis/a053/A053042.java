package irvine.oeis.a053;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053042 a(n) = n^n + n!.
 * @author Georg Fischer
 */
public class A053042 implements Sequence {

  private int mN = 0;
  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN).add(FACTORIAL.factorial(mN));
  }
}
