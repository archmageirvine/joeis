package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A082561 a(1)=1, a(n)=3*a(n-1) if n is not a multiple of 3, or a(n)=a(n/3)+1 if n is a multiple of 3.
 * @author Georg Fischer
 */
public class A082561 extends MemorySequence {

  {
    setOffset(1);
    add(null); // 0 unused
  }

  @Override
  public Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.ONE;
    }
    return n % 3 != 0 ? a(n - 1).multiply(3) : a(n / 3).add(1);
  }
}
