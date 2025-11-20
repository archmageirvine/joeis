package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081952 Smallest Fibonacci number which is one more than the product of n distinct numbers &gt; 1.
 * @author Sean A. Irvine
 */
public class A081952 extends Sequence1 {

  private long mN = 0;
  private int mM = 2;

  private boolean is(final Z[] d, final Z t, final int pos, final int cnt) {
    if (cnt == mN) {
      return true;
    }
    for (int k = pos + 1; k < d.length && d[k].compareTo(t) <= 0; ++k) {
      final Z[] qr = t.divideAndRemainder(d[k]);
      if (qr[1].isZero() && is(d, qr[0], k, cnt + 1)) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final int m) {
    final Z f = Functions.FIBONACCI.z(m);
    final Z f1 = f.subtract(1);
    final FactorSequence fs = Jaguar.factor(f1);
    if (fs.bigOmega() < mN) {
      return false;
    }
    return is(fs.divisorsSorted(), f1, 0, 0);
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (is(mM)) {
        return Functions.FIBONACCI.z(mM);
      }
      ++mM;
    }
  }
}
