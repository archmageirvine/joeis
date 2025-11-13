package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A390451 Numbers k such that the concatenation of a permutation of its divisors is prime.
 * @author Sean A. Irvine
 */
public class A390451 extends Sequence1 {

  private long mN = 0;

  private boolean is(final Z[] div) {
    // If sum of digits is multiple of 3, then no prime is possible
    long digSum = 0;
    for (final Z v : div) {
      digSum += Functions.DIGIT_SUM.l(v);
    }
    if (digSum % 3 == 0) {
      return false;
    }
    // Otherwise, starting generating permutation
    final String[] d = ZUtils.toString(div);
    final Permutation perm = new Permutation(d.length);
    int[] p;
    while ((p = perm.next()) != null) {
      // Quick check for last digit
      final String last = d[p[p.length - 1]];
      final char c = last.charAt(last.length() - 1);
      if (c == '1' || c == '3' || c == '7' || c == '9') {
        // Check full concatenation
        final StringBuilder sb = new StringBuilder();
        for (final int v : p) {
          sb.append(d[v]);
        }
        if (new Z(sb).isProbablePrime()) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(Jaguar.factor(++mN).divisors())) {
        return Z.valueOf(mN);
      }
    }
  }
}
