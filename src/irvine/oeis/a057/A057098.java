package irvine.oeis.a057;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Triple;

/**
 * A057098 Shortest side of a Pythagorean triangle (ordered by the product of the sides).
 * @author Sean A. Irvine
 */
public class A057098 extends Sequence1 {

  // Cf. A057096.

  private final TreeMap<Z, List<Triple<Long>>> mProducts = new TreeMap<>();
  private long mC = 4;
  private List<Triple<Long>> mA = Collections.emptyList();

  protected Z select(final Triple<Long> t) {
    return Z.valueOf(t.left());
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      while (mProducts.isEmpty() || mProducts.firstKey().compareTo(Z.valueOf(mC).square()) > 0) {
        final long c2 = ++mC * mC;
        for (long b = 2; b < mC; ++b) {
          final long a2 = c2 - b * b;
          final long a = LongUtils.sqrt(a2);
          if (a <= b && a * a == a2) {
            final Z prod = Z.valueOf(a).multiply(b).multiply(mC);
            final Triple<Long> t = new Triple<>(a, b, mC);
            final List<Triple<Long>> l = mProducts.get(prod);
            if (l == null) {
              final ArrayList<Triple<Long>> lst = new ArrayList<>();
              lst.add(t);
              mProducts.put(prod, lst);
            } else {
              l.add(t);
            }
          }
        }
      }
      final Map.Entry<Z, List<Triple<Long>>> entry = mProducts.pollFirstEntry();
      mA = entry.getValue();
    }
    return select(mA.remove(0));
  }
}
