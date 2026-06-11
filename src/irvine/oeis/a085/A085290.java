package irvine.oeis.a085;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A085290 Max[p1^b1] over all sorted multiplicative partitions of n! of length n.
 * @author Sean A. Irvine
 */
public class A085290 extends AbstractSequence {

  private long mN = 3;
  private Z mF = Z.SIX;
  private Z mMax = Z.ZERO;

  /** Construct the sequence. */
  public A085290() {
    super(4);
  }

  private void search(final Z n, final TreeMap<Z, Integer> f, final Z first, final Z prev, final int parts) {
    if (parts == mN - 1) {
      if (n.compareTo(prev) >= 0 && Functions.OMEGA.l(n) == 1) {
        mMax = first;
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
      if (mMax != null && parts == 0 && pv.compareTo(mMax) <= 0) {
        return;
      }
      final TreeMap<Z, Integer> copy = new TreeMap<>(f);
      copy.remove(p);
      search(n.divide(pv), copy, first == null ? pv : first, pv, parts + 1);
      Z q = Z.ONE;
      for (int k = 1; k < v; ++k) {
        q = q.multiply(p);
        if (q.compareTo(prev) >= 0 && v - k >= k && (parts != 0 || mMax == null || q.compareTo(mMax) > 0)) {
          copy.put(p, v - k);
          search(n.divide(q), copy, first == null ? q : first, q, parts + 1);
          copy.remove(p);
        }
      }
    }
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mMax = Z.ZERO;
    final TreeMap<Z, Integer> f = new TreeMap<>();
    final FactorSequence fs = Jaguar.factor(mF);
    for (final Z p : fs.toZArray()) {
      f.put(p, fs.getExponent(p));
    }
    search(mF, f, null, Z.TWO, 0);
    return mMax;
  }
}
