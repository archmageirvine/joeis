package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066637 Total number of elements in all factorizations of n with all factors &gt; 1.
 * @author Sean A. Irvine
 */
public class A066637 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private final MemoryFunctionInt2<Z[]> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z[] compute(final int n, final int m) {
      final Z[] res = new Z[] {Z.ZERO, Z.ZERO};
      final FactorSequence fs = Jaguar.factor(n);
      if (fs.bigOmega() > 1) {
        for (final Z dd : fs.divisors()) {
          final int d = dd.intValue();
          if (d > 1 && d < n && d <= m) {
            final Z[] b = get(n / d, d);
            res[0] = res[0].add(b[0]);
            res[1] = res[1].add(b[1]);
          }
        }
        res[1] = res[1].add(res[0]);
      }
      if (n <= m) {
        res[0] = res[0].add(1);
        res[1] = res[1].add(1);
      }
      return res;
    }
  };

  @Override
  public Z next() {
    return ++mN < 2 ? Z.ZERO : mB.get(mN, mN)[1];
  }
}
