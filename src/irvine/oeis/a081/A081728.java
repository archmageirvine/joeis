package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000364;

/**
 * A081728 Length of periods of Euler numbers modulo prime(n).
 * @author Sean A. Irvine
 */
public class A081728 extends A000040 {

  private final DirectSequence mA = DirectSequence.create(new A000364());

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    int k = 0;
    int j = 1;
    while (true) {
      final long k0 = mA.a(k).mod(p);
      final long k1 = mA.a(k + 1).mod(p);
      final long j0 = mA.a(j).mod(p);
      final long j1 = mA.a(j + 1).mod(p);
      if (k0 == j0 && k1 == j1) {
        return Z.valueOf(j - k);
      }
      ++k;
      j += 2;
    }
  }
}
