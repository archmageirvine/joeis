package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a007.A007770;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A068571 Number of happy numbers &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A068571 extends A007770 {

  // After Charles R Greathouse IV

  private int mN = -1;

  /** Construct the sequence. */
  public A068571() {
    super(0);
  }

  private long f(final int[] d) {
    long s = 0;
    for (int i = 0; i < d.length; ++i) {
      s += (long) d[i] * (i + 1) * (i + 1);
    }
    return s;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final int[] v = new int[9];
    final Bumper bumper = BumperFactory.weaklyIncreasing(mN);
    do {
      final int[] d = new int[9];
      for (int k = 0; k < d.length; ++k) {
        d[k] = (k > 7 ? mN : v[k + 1]) - v[k];
      }
      if (isHappy(Z.valueOf(f(d)))) {
        sum = sum.add(Binomial.multinomial(mN, d).divide(Functions.FACTORIAL.z(v[0])));
      }
    } while (bumper.bump(v));
    return sum.add(1);
  }
}
