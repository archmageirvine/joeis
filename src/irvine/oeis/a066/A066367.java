package irvine.oeis.a066;

import java.util.function.Function;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.factor.util.FactorSequence;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A066367 The floor(p(n)/n)-perfect numbers, where p(n) denotes the n-th prime and f-perfect numbers for an arithmetical function f are defined in A066218.
 * @author Sean A. Irvine
 */
public class A066367 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Function<Integer, Long> mFunction;
  private int mN = 1;

  protected A066367(final Function<Integer, Long> function) {
    mFunction = function;
  }

  /** Construct the sequence. */
  public A066367() {
    this(k -> k == 0 ? 0 : Puma.prime(k) / k);
  }

  private final MemoryFunction1<Long> mF = new MemoryFunction1<>() {
    @Override
    protected Long compute(final int n) {
      return mFunction.apply(n);
    }
  };

  private boolean is(final int n) {
    long s = mF.get(n);
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z dd : fs.divisors()) {
      final int d = dd.intValue();
      if (d != n) {
        s -= mF.get(d);
        if (s < 0) {
          return false;
        }
      }
    }
    return s == 0;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 1000000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}
