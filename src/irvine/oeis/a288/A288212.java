package irvine.oeis.a288;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A288212 Start with k=2*n, and until k+1 is prime, apply the map k -&gt; k*(least prime factor of (k+1)); then a(n) = k+1, or 0 if k+1 never reaches a prime.
 * @author Sean A. Irvine
 */
public class A288212 extends Sequence1 {

  private Z mN = Z.ZERO;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    mN = mN.add(2);
    if (mVerbose) {
      StringUtils.message("Starting search for a(" + mN.divide2() + ")");
    }
    Z t = mN;
    Z u;
    while (!(u = t.add(1)).isProbablePrime()) {
      t = t.multiply(LeastPrimeFactorizer.lpf(u));
    }
    return u;
  }

  /**
   * Run this sequence for a specific value.
   * @param args value to run
   */
  public static void main(final String... args) {
    final A288212 seq = new A288212();
    seq.mN = new Z(args[0]).multiply2().subtract(2);
    System.out.println(seq.next());
  }
}
