package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A082560 a(1)=1, a(n)=2*a(n-1) if n is odd, or a(n)=a(n/2)+1 if n is even.
 * @author Georg Fischer
 */
public class A082560 extends MemorySequence {

  {
    add(null); // 0 unused
  }

  @Override
  public Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.ONE;
    }
    return ((n & 1) == 1) ? a(n - 1).multiply2() : a(n / 2).add(1);
  }
}
