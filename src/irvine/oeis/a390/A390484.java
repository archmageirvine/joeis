package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A390484 Smallest prime obtained by concatenating a permutation of the divisors of A390451(n).
 * @author Sean A. Irvine
 */
public class A390484 extends Sequence1 {

  private long mN = 0;

  private Z search(final Z[] div) {
    // If sum of digits is multiple of 3, then no prime is possible
    long digSum = 0;
    for (final Z v : div) {
      digSum += Functions.DIGIT_SUM.l(v);
    }
    if (digSum % 3 == 0) {
      return null;
    }
    // Otherwise, starting generating permutation
    Z min = null;
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
        final Z t = new Z(sb);
        if ((min == null || t.compareTo(min) < 0) && new Z(sb).isProbablePrime()) {
          min = t;
        }
      }
    }
    return min;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = search(Jaguar.factor(++mN).divisors());
      if (t != null) {
        return t;
      }
    }
  }
}
