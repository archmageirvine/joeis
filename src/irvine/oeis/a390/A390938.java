package irvine.oeis.a390;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390938 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A390938 extends Sequence0 {

  private Map<Z, Z> mA = null;
  private final LinkedList<Z> mRow = new LinkedList<>();

  @Override
  public Z next() {
    while (mRow.isEmpty()) {
      if (mA == null) {
        mA = Collections.singletonMap(Z.ONE, Z.ONE);
        mRow.add(Z.ONE);
      } else {
        final Map<Z, Z> prev = mA;
        mA = new LinkedHashMap<>(prev); // We need to ensure chronological ordering!
        for (final Map.Entry<Z, Z> e : prev.entrySet()) {
          final Z k = e.getKey();
          final Z v = e.getValue();
          if (mA.merge(v, k, Z::add).equals(k)) {
            // i.e., this is the first time v was added
            mRow.add(v);
          }
        }
      }
    }
    return mRow.pollFirst();
  }
}
