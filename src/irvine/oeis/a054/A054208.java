package irvine.oeis.a054;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;
import irvine.util.string.StringUtils;

/**
 * A054200.
 * @author Sean A. Irvine
 */
public class A054208 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final List<Triple<Long>> mA = new ArrayList<>();
  private long mN = 1;
  private int mM = 0;

  protected long select(final Triple<Long> t) {
    if (mVerbose) {
      StringUtils.message(t.toString());
    }
    return t.left();
  }

  @Override
  public Z next() {
    if (mM >= mA.size()) {
      mA.clear();
      mM = 0;
      do {
        final Z t = Z.valueOf(++mN).pow(3);
        Z bk, bj;
        for (long k = 1; (bk = Binomial.binomial(k + 2, 3)).compareTo(bj = t.subtract(bk)) <= 0; ++k) {
          // Get near the solution in double, then check
          final Z u = bj.square().multiply(729).subtract(3);
          final double v = Math.sqrt(u.doubleValue());
          final double w = 3 * v + bj.multiply(81).doubleValue();
          final double x = Math.cbrt(w);
          final double y = x / 3 + 1 / x - 1;
          if (Binomial.binomial((long) y + 2, 3).equals(bj)) {
            mA.add(new Triple<>(mN, (long) y, k));
          } else if (Binomial.binomial((long) y + 3, 3).equals(bj)) {
            mA.add(new Triple<>(mN, (long) y + 1, k));
          }
        }
      } while (mA.isEmpty());
    }
    return Z.valueOf(select(mA.get(mM++)));
  }
}

