package irvine.oeis.a048;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048249 Number of distinct values produced from sums and products of n unity arguments.
 * @author Sean A. Irvine
 */
public class A048249 implements Sequence {

  private final ArrayList<Set<Z>> mA = new ArrayList<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Collections.singleton(Z.ONE));
    } else {
      final TreeSet<Z> next = new TreeSet<>();
      for (int k = 0; k <= mA.size() / 2; ++k) {
        for (final Z a : mA.get(k)) {
          for (final Z b : mA.get(mA.size() - k - 1)) {
            next.add(a.add(b));
            next.add(a.multiply(b));
          }
        }
      }
      mA.add(next);
    }
    return Z.valueOf(mA.get(mA.size() - 1).size());
  }
}
