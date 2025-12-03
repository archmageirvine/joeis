package irvine.oeis.a390;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A390940 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A390940 extends Sequence0 {

  private static final Z[] SPECIAL = ZUtils.toZ(1, 2, 4, 24, 28, 30, 32, 64, 88, 128, 132, 134, 268, 416, 1920, 3712, 7424);
  private Map<Z, Z> mA = null;
  private final TreeSet<Z> mRow = new TreeSet<>();

  private void step() {
    final Map<Z, Z> prev = mA;
    mA = new HashMap<>(prev); // We need to ensure chronological ordering!
    for (final Map.Entry<Z, Z> e : prev.entrySet()) {
      final Z k = e.getKey();
      final Z v = e.getValue();
      if (mA.merge(v, k, Z::add).equals(k)) {
        // i.e., this is the first time v was added
        mRow.add(v);
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
      mRow.add(Z.ONE);
    }
    while (mRow.isEmpty() || mRow.first().compareTo(getMin()) > 0) {
      step();
    }
    return mRow.pollFirst();
  }
}
