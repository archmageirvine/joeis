package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000364;

/**
 * A081727 Length of periods of Euler numbers modulo n.
 * @author Sean A. Irvine
 */
public class A081727 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A000364());
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    int j = 1;
    while (true) {
      final long k0 = mA.a(k).mod(mN);
      final long k1 = mA.a(k + 1).mod(mN);
      final long j0 = mA.a(j).mod(mN);
      final long j1 = mA.a(j + 1).mod(mN);
      if (k0 == j0 && k1 == j1) {
        return Z.valueOf(j - k);
      }
      ++k;
      j += 2;
    }
  }
}
