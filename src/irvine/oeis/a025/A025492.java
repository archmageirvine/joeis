package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002034;

/**
 * A025492 Fixed point reached by iterating the Kempner function A002034 starting at n.
 * @author Sean A. Irvine
 */
public class A025492 implements Sequence {

  private final MemorySequence mA2034 = MemorySequence.cachedSequence(new PrependSequence(new A002034(), 0));
  private int mN = 0;

  @Override
  public Z next() {
    int a = mA2034.a(++mN).intValueExact();
    while (true) {
      final int b = mA2034.a(a).intValueExact();
      if (a == b) {
        return Z.valueOf(a);
      }
      a = b;
    }
  }
}
