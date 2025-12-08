package irvine.oeis.a390;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A390940 Terms of A390939 sorted in increasing order, where A390939 lists the keys added in the map initialized with T[1] = 1 and repeatedly T[v] := k + (T[v] if defined else 0) for all key-value pairs (k, v) in T.
 * @author Sean A. Irvine
 */
public class A390940 extends Sequence0 {

  private static final Z[] SPECIAL = ZUtils.toZ(1, 2, 4, 24, 28, 30, 32, 64, 88, 128, 132, 134, 268, 416, 1920, 3712, 7424); // A390943
  private Map<Z, Z> mA = null;
  private final TreeSet<Z> mS = new TreeSet<>();

  private void step() {
    final Map<Z, Z> prev = mA;
    mA = new HashMap<>(prev);
    for (final Map.Entry<Z, Z> e : prev.entrySet()) {
      final Z k = e.getKey();
      final Z v = e.getValue();
      if (mA.merge(v, k, Z::add).equals(k)) {
        // i.e., this is the first time v was added
        mS.add(v);
      }
    }
  }

  private Z getMin() {
    Z min = null;
    for (final Z k : SPECIAL) {
      final Z v = mA.get(k);
      if (v != null) {
        if (min == null || v.compareTo(min) < 0) {
          min = v;
        }
      }
    }
    return min;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Collections.singletonMap(Z.ONE, Z.ONE);
      mS.add(Z.ONE);
      // Do some initial steps to handle 6
      for (int k = 0; k < 9; ++k) {
        step();
      }
    }
    while (mS.isEmpty() || mS.first().compareTo(getMin()) > 0) {
      step();
    }
    return mS.pollFirst();
  }
}
