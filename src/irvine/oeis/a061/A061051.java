package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061051 Smallest square of the form [n digits][same n digits][further digits].
 * @author Sean A. Irvine
 */
public class A061051 extends Sequence0 {

  // After Chai Wah Wu

  private static final long[] SUFFIX = {0, 1, 4, 5, 6, 9};
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Z nStart = Z.TEN.pow(mN - 1);
    final Z nEnd = nStart.multiply(10);
    for (Z i = nStart; i.compareTo(nEnd) < 0; i = i.add(1)) {
      final Z k = i.multiply(nEnd).add(i);
      if (k.isSquare()) {
        return k;
      }
    }
    for (Z i = nStart; i.compareTo(nEnd) < 0; i = i.add(1)) {
      final Z k = i.multiply(nEnd).add(i);
      for (final long s : SUFFIX) {
        final Z t = k.multiply(10).add(s);
        if (t.isSquare()) {
          return t;
        }
      }
    }
    throw new RuntimeException();
  }
}
