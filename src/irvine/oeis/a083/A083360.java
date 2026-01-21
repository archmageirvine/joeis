package irvine.oeis.a083;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002808;

/**
 * A083360 Subsequence of sequence A083359 in which factors do not overlap in the number.
 * @author Sean A. Irvine
 */
public class A083360 extends A002808 {

  private boolean is(final List<String> p, final int pos, final String s, final long used) {
    if (pos < 0) {
      return used == (1L << s.length()) - 1;
    }
    if (pos > 0 && used == (1L << s.length()) - 1 && !p.get(pos).equals(p.get(0))) {
      return false; // Efficiency
    }
    final String q = p.get(pos);
    final long mask = (1L << q.length()) - 1;
    for (int k = s.indexOf(q); k >= 0; k = s.indexOf(q, k + 1)) {
      if ((used & (mask << k)) == 0) {
        final long u = used | (mask << k);
        if (is(p, pos - 1, s, u)) {
          return true;
        }
      }
    }
    if (pos == p.size() - 1 || !q.equals(p.get(pos + 1))) {
      return false;
    }
    return is(p, pos - 1, s, used); // i.e., don't use a particular factor
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
