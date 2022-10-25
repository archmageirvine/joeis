package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A050192 a(n)=a(n-1)+a(n-2)-d, where d=a(n/2) if n is even, else d=0; 2 initial terms.
 * @author Sean A. Irvine
 */
public class A050192 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    } else if (n == 2) {
      return Z.ZERO;
    } else if ((n & 1) == 0) {
      return a(n - 1).add(a(n - 2)).subtract(a(n / 2));
    } else {
      return a(n - 1).add(a(n - 2));
    }
  }
}

