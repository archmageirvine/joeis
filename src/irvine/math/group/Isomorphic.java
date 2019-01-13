package irvine.math.group;

import irvine.math.api.Group;
import irvine.math.set.AbstractSet;
import irvine.math.z.Z;

import java.util.Arrays;

/**
 * Utility functions relating to isomorphism.
 * @author Sean A. Irvine
 */
public final class Isomorphic {

  private Isomorphic() { }

  private static <E> Z[] spectrum(final Group<E> g) {
    final Z[] orders = new Z[g.size().intValueExact()];
    int k = 0;
    for (final E e : g) {
      orders[k++] = g.order(e);
    }
    Arrays.sort(orders);
    return orders;
  }

  static boolean isIsomorphic(final Group<?> g, final Group<?> h) {
    if (g == h) {
      return true;
    }
    if (!AbstractSet.sameSize(g, h)) {
      return false;
    }
    if (g.isAbelian() != h.isAbelian()) {
      return false;
    }
    // Cyclic properties, both groups must have the same cyclic status
    // All cyclic groups of the same order (including infinite) are isomorphic
    final boolean gCyclic = g.isCyclic();
    final boolean hCyclic = h.isCyclic();
    if (gCyclic != hCyclic) {
      return false;
    }
    if (gCyclic) {
      return true;
    }
    if (!g.isInfinite()) {
      // All groups of the same prime order are isomorphic
      if (g.size().isProbablePrime()) {
        return true;
      }

      // For small enough finite group can compare the orders of elements
      final Z[] spectrumG = spectrum(g);
      final Z[] spectrumH = spectrum(h);
      assert spectrumG.length == spectrumH.length;
      if (!Arrays.equals(spectrumG, spectrumH)) {
        return false;
      }
      //return true; // Possibly bogus, but seems to work, e.g. for A003276.
    }
    throw new UnsupportedOperationException();
  }
}
