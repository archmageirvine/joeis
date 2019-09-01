package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002034;

/**
 * A025493 Smallest k that converges after exactly n iterations of the Kempner function <code>A002034</code>.
 * @author Sean A. Irvine
 */
public class A025493 implements Sequence {

  // There must be a better way since a big term is known

  private final MemorySequence mA2034 = MemorySequence.cachedSequence(new PrependSequence(new A002034(), 0));
  private int mN = -1;
  private int mK = 0;

  @Override
  public Z next() {
    if (++mN > 4) {
      throw new UnsupportedOperationException();
    }
    while (true) {
      int a = ++mK;
      int c = -1;
      while (true) {
        if (++c > mN) {
          break;
        }
        final int b = mA2034.a(a).intValueExact();
        if (a == b) {
          if (c == mN) {
            return Z.valueOf(mK);
          } else {
            break;
          }
        }
        a = b;
      }
    }
  }
}
