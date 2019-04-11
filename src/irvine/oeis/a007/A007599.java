package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007599 <code>a(n+1) = a(n)+a(a(a(</code>..(n-1)..))), depth <code>[ n/2 ]</code>.
 * @author Sean A. Irvine
 */
public class A007599 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    int a = n - 2;
    for (int k = 0; k < n / 2; ++k) {
      a = get(a).intValueExact();
    }
    return get(n - 1).add(a);
  }
}
