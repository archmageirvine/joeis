package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A060209 Dunckley sequence: number of bases in which the n-th composite number is a Smith number.
 * @author Sean A. Irvine
 */
public class A060209 extends Sequence1 {

  private final Sequence mComposites = new A002808();

  private boolean isSmith(final int n, final int base, final FactorSequence fs) {
    final long d = Functions.DIGIT_SUM.l(base, n);
    long s = 0;
    for (final Z p : fs.toZArray()) {
      s += Functions.DIGIT_SUM.l(base, p) * fs.getExponent(p);
    }
    return s == d;
  }

  @Override
  public Z next() {
    final int n = mComposites.next().intValueExact();
    long cnt = 0;
    final FactorSequence fs = Jaguar.factor(n);
    for (int base = 2; base <= n; ++base) {
      if (isSmith(n, base, fs)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

