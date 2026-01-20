package irvine.oeis.a083;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002808;

/**
 * A083359 Visible Factor Numbers, or VFNs: numbers n with the property that every prime factor of n can be found in the decimal expansion of n and every digit of n can be found in a prime factor.
 * @author Sean A. Irvine
 */
public class A083359 extends A002808 {

  private boolean is(final List<String> p, final int pos, final String s, final long used) {
    if (used == (1L << s.length()) - 1) {
      return true;
    }
    if (pos < 0) {
      return false;
    }
    final String q = p.get(pos);
    final long mask = (1L << q.length()) -1;
    for (int k = s.indexOf(q); k >= 0; k = s.indexOf(q, k + 1)) {
      final long u = used | (mask << k);
      if (u != used && is(p, pos - 1, s, u)) {
        return true;
      }
    }
    return is(p, pos - 1, s, used); // i.e., don't used a particular factor
  }

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
    final ArrayList<String> g = new ArrayList<>();
    for (final Z p : f) {
      final String h = p.toString();
      final int e = fs.getExponent(p);
      for (int k = 0; k < e; ++k) {
        g.add(h);
      }
    }
    return is(g, g.size() - 1, s, 0);
  }

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (is(c.longValue())) {
        return c;
      }
    }
  }
}
