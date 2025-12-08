package irvine.oeis.a390;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390944 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A390944 extends Sequence0 {

  private Map<Z, Z> mA = null;
  private final Z mKey;

  protected A390944(final Z key) {
    mKey = key;
  }

  /** Construct the sequence. */
  public A390944() {
    this(Z.FOUR);
  }

  private void step() {
    final Map<Z, Z> prev = mA;
    mA = new HashMap<>(prev);
    for (final Map.Entry<Z, Z> e : prev.entrySet()) {
      final Z k = e.getKey();
      final Z v = e.getValue();
      mA.merge(v, k, Z::add);
    }
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Collections.singletonMap(Z.ONE, Z.ONE);
    } else {
      step();
    }
    return mA.getOrDefault(mKey, Z.ZERO);
  }
}
