package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A050193 a(n)=a(n-1)+a(n-2)-d, where d=a(n/3) if 3 divides n, else d=0; 2 initial terms.
 * @author Sean A. Irvine
 */
public class A050193 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 3) {
      return Z.ONE;
    } else if (n % 3 == 0) {
      return a(n - 1).add(a(n - 2)).subtract(a(n / 3));
    } else {
      return a(n - 1).add(a(n - 2));
    }
  }
}

