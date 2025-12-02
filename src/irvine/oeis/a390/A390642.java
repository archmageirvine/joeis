package irvine.oeis.a390;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A390642 allocated for Giorgos Kalogeropoulos.
 * @author Sean A. Irvine
 */
public class A390642 extends CachedSequence {

  private final TreeMap<Long, Long> mSums = new TreeMap<>();

  /** Construct the sequence. */
  public A390642() {
    super(1);
  }

  @Override
  protected Z compute(final Z nn) {
    final int n = nn.intValueExact();
    if (n == 1) {
      mSums.put(2L, 1L);
      return Z.ONE;
    }
    long k = 0;
    while (true) {
      long cnt = 0;
      for (final Map.Entry<Long, Long> e : mSums.entrySet()) {
        final long v = e.getKey();
        if (v > k) {
          break;
        }
        cnt += e.getValue();
      }
      if (cnt < k - n + 1) {
        break;
      }
      ++k;
    }
    for (final Z v : values()) {
      mSums.merge(v.longValueExact() + k, 1L, Long::sum);
    }
    mSums.merge(2 * k, 1L, Long::sum);
    return Z.valueOf(k);
  }
}
