package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A392070 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A392070 extends Sequence1 {

  private long mN = 1;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private boolean is(final Z t) {
    final long omega = Functions.OMEGA.i(t);
    int cnt = 0;
    for (final Z d : Jaguar.factor(t).divisors()) {
      if (d.square().compareTo(t) <= 0 && Functions.OMEGA.i(t.divide(d).add(d)) == omega && ++cnt > 1) {
        return false;
      }
    }
    return cnt == 1;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(Z.ONE.shiftLeft(++mN).subtract(1))) {
        return Z.valueOf(mN);
      }
      if (mVerbose) {
        StringUtils.message(mN + " is not a term");
      }
    }
  }

  /**
   * Start the search from a specific value.
   * @param args starting value
   */
  public static void main(final String[] args) {
    if (args.length > 1 && "--dump".equals(args[1])) {
      // Print unsolved cofactors
      final Z t = Z.ONE.shiftLeft(Integer.parseInt(args[0])).subtract(1);
      for (final Z d : Jaguar.factor(t).divisors()) {
        final FactorSequence fs = Jaguar.factorAllowIncomplete(t.divide(d).add(d));
        for (final Z v : fs.toZArray()) {
          if (fs.getStatus(v) == FactorSequence.COMPOSITE || fs.getStatus(v) == FactorSequence.UNKNOWN) {
            System.out.println(v);
          }
        }
      }
      return;
    }
    final A392070 seq = new A392070();
    seq.mN = Integer.parseInt(args[0]) - 1;
    while (true) {
      System.out.println(seq.next());
    }
  }
}

