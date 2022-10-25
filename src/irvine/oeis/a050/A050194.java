package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A050194 a(n)=a(n-1)+a(n-2)-d, where d=a(n/4) if 4 divides n, else d=0; 2 initial terms.
 * @author Sean A. Irvine
 */
public class A050194 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.ONE;
    } else if ((n & 3) == 0) {
      return get(n - 1).add(get(n - 2)).subtract(get(n / 4));
    } else {
      return get(n - 1).add(get(n - 2));
    }
  }
}

