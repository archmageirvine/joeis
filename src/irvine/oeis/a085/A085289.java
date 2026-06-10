package irvine.oeis.a085;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A085289 Number of sorted multiplicative partitions of n! of length n.
 * @author Sean A. Irvine
 */
public class A085289 extends Sequence2 {

  private long mN = 1;
  private Z mF = Z.ONE;
  private long mCount = 0;

  private void search(final Z n, final TreeMap<Z, Integer> f, final Z prev, final int parts) {
    if (parts == mN - 1) {
      if (n.compareTo(prev) >= 0 && Functions.OMEGA.l(n) == 1) {
        ++mCount;
      }
      return;
    }
    if (f.size() > mN - parts) {
      return;
    }
    for (final Map.Entry<Z, Integer> e : f.entrySet()) {
      final Z p = e.getKey();
      final int v = e.getValue();
      final Z pv = p.pow(v);
      if (pv.compareTo(prev) < 0) {
        return;
      }
      final TreeMap<Z, Integer> copy = new TreeMap<>(f);
      copy.remove(p);
      search(n.divide(pv), copy, pv, parts + 1);
      Z q = Z.ONE;
      for (int k = 1; k < v; ++k) {
        q = q.multiply(p);
        if (q.compareTo(prev) >= 0) {
          if (v - k >= k) {
            copy.put(p, v - k);
            search(n.divide(q), copy, q, parts + 1);
            copy.remove(p);
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mCount = 0;
    final TreeMap<Z, Integer> f = new TreeMap<>();
    final FactorSequence fs = Jaguar.factor(mF);
    for (final Z p : fs.toZArray()) {
      f.put(p, fs.getExponent(p));
    }
    search(mF, f, Z.TWO, 0);
    return Z.valueOf(mCount);
  }
}
