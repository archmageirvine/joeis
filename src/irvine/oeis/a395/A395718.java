package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A395718 allocated for Jake Foth.
 * @author Sean A. Irvine
 */
public class A395718 extends Sequence1 {

  private static long g(final long n) {
    return (Functions.SQRT.l(5 * n * n) - n) / 2;
  }

  private long mN = 0;
  private final Sequence mS = new CachedSequence(0, Long.class, (self, n) -> {
    if (n <= 0) {
      return Z.ZERO;
    }
    final long m = g(n);
    return self.a(m).add(g(n - m - 1) + 1);
  });

  private Z mA = mS.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mS.next();
      if (mA.subtract(t).isOne()) {
        return Z.valueOf(mN);
      }
    }
  }
}
