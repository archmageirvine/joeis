package irvine.oeis.a083;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A083359 Visible Factor Numbers, or VFNs: numbers n with the property that every prime factor of n can be found in the decimal expansion of n and every digit of n can be found in a prime factor.
 * @author Sean A. Irvine
 */
public class A083359 extends Sequence1 {

  private long mN = 734;

  // Deeper checking avoiding reuse of digits in s
//  private boolean is(final String[] p, final int[] e, final String s, final int pos) {
//    if (pos >= s.length()) {
//      return true;
//    }
//    final char c = s.charAt(pos);
//    for (int k = 0; k < p.length; ++k) {
//      if (e[k] > 0 && p[k].indexOf(c) >= 0) {
//        --e[k];
//        if (is(p, e, s, pos + 1)) {
//          return true;
//        }
//        ++e[k];
//      }
//    }
//    return false;
//  }

  private boolean is(final long n) {
    final String s = String.valueOf(n);
    final FactorSequence fs = Jaguar.factor(n);
    final Z[] f = fs.toZArray();
    for (final Z p : f) {
      if (!s.contains(p.toString())) {
        return false;
      }
    }
    final int[] cnts = ZUtils.digitCounts(n);
    for (final Z p : f) {
      final int[] c = ZUtils.digitCounts(p);
      final int e = fs.getExponent(p);
      for (int k = 0; k < cnts.length; ++k) {
        cnts[k] -= e * c[k];
      }
    }
    for (final int v : cnts) {
      if (v > 0) {
        return false;
      }
    }
    return true;
//    final String[] ps = new String[f.length];
//    final int[] e = new int[f.length];
//    for (int k = 0; k < f.length; ++k) {
//      ps[k] = f[k].toString();
//      e[k] = fs.getExponent(f[k]);
//    }
//    return is(ps, e, s, 0);
  }

  @Override
  public Z next() {
    while (true) {
      if (!Predicates.PRIME.is(++mN) && is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
