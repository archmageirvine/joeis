package irvine.oeis.a056;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056162 a(n) = Sum_{k=0..n} (k!)^(n-k).
 * @author Georg Fischer
 */
public class A056162 implements Sequence {

  private int mN = -1;
  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN, k -> FACTORIAL.factorial(k).pow(mN - k));
  }
}
