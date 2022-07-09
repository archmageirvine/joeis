package irvine.oeis.a057;

import java.util.HashMap;
import java.util.Map;

import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057647 Number of walks of length n on the upper-right part of the hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A057647 implements Sequence {

  protected HashMap<Long, Z> mCounts = new HashMap<>();

  @Override
  public Z next() {
    Z totalCount = Z.ZERO;
    if (mCounts.isEmpty()) {
      mCounts.put(Lattices.HEXAGONAL.origin(), Z.ONE);
      totalCount = Z.ONE;
    } else {
      final HashMap<Long, Z> newCounts = new HashMap<>();
      for (final Map.Entry<Long, Z> e : mCounts.entrySet()) {
        final long pt = e.getKey();
        final Z cnt = e.getValue();
        for (final long p : Lattices.HEXAGONAL.neighbours(pt)) {
          if (Lattices.HEXAGONAL.ordinate(p, 0) >= 0 && Lattices.HEXAGONAL.ordinate(p, 1) >= 0) {
            final Z c = newCounts.get(p);
            newCounts.put(p, c == null ? cnt : c.add(cnt));
          }
        }
      }
      for (final Z c : newCounts.values()) {
        totalCount = totalCount.add(c);
      }
      mCounts = newCounts;
    }
    return totalCount;
  }
}
