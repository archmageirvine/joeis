package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A050192 a(n)=a(n-1)+a(n-2)-d, where d=a(n/2) if n is even, else d=0; 2 initial terms.
 * @author Sean A. Irvine
 */
public class A050192 extends MemorySequence {

  {
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
      return get(n - 1).add(get(n - 2)).subtract(get(n / 2));
    } else {
      return get(n - 1).add(get(n - 2));
    }
  }
}

