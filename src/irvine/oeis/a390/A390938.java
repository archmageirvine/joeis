package irvine.oeis.a390;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390938 Number of new keys inserted at iteration n in a map initialized with T[1] := 1, then iterate: for each (key, value) already in T, T[value] := T[value]+key if T[value] already exists, else T[value] := key.
 * @author Sean A. Irvine
 */
public class A390938 extends Sequence0 {

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
