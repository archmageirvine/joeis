package irvine.oeis.a077;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A077607 Convolutory inverse of the factorial sequence.
 * a(n) = -n!*a(1)-(n-1)!*a(2)-...-2!*a(n-1), with a(1)=1.
 * @author Georg Fischer
 */
public class A077607 extends MemorySequence {

  private int mN = 0;
  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  /** Construct the sequence. */
  public A077607() {
    add(Z.ZERO);
  }

  @Override
  public Z computeNext() {
    ++mN;
    if (mN == 1) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(1, mN - 1, k -> FACTORIAL.factorial(mN + 1 - k).multiply(a(k))).negate();
  }
}
