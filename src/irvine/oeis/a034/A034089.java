package irvine.oeis.a034;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034089 Numbers that are proper divisors of the number you get by rotating digits right once.
 * @author Sean A. Irvine
 */
public class A034089 implements Sequence {

  // After M. F. Hasler

  private final TreeMap<Z, Z> mA = allPeriods();

  private Z period(final long p, final long q) {
    final TreeSet<Z> s = new TreeSet<>();
    Z zp = Z.valueOf(p);
    Z zq = Z.valueOf(q);
    while (!s.contains(zp)) {
      s.add(zp);
      zp = zp.modMultiply(10, zq);
    }
    final List<Z> t = new ArrayList<>();
    while (t.isEmpty() || !t.get(0).equals(zp)) {
      t.add(zp);
      zp = zp.modMultiply(10, zq);
    }
    Z v = Z.ZERO;
    for (Z u : t) {
      v = v.multiply(10).add(u.multiply(10).divide(q));
    }
    return v;
  }

  private TreeMap<Z, Z> allPeriods() {
    final TreeMap<Z, Z> res = new TreeMap<>();
    for (long k = 2; k <= 9; ++k) {
      for (long i = k; i <= 9; ++i) {
        final Z p = period(i, 10 * k - 1);
        res.put(p, p);
      }
    }
    return res;
  }

  @Override
  public Z next() {
    final Map.Entry<Z, Z> e = mA.pollFirstEntry();
    mA.put(new Z(e.getKey().toString() + e.getValue()), e.getValue());
    return e.getKey();
  }
}

