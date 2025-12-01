package irvine.oeis.a390;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390938 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A390938 extends Sequence0 {

  // Note this sequence actually has a simpler program possible, see formulas

  private Map<Z, Z> mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Collections.singletonMap(Z.ONE, Z.ONE);
      return Z.ONE;
    }
    final Map<Z, Z> prev = mA;
    mA = new HashMap<>(prev);
    for (final Map.Entry<Z, Z> e : prev.entrySet()) {
      final Z k = e.getKey();
      final Z v = e.getValue();
      mA.merge(v, k, Z::add); // Deliberate swap of key and value (that's what the sequence is)
    }
    return Z.valueOf(mA.size() - prev.size());
  }
}
