package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A046695 Sprague-Grundy values for the game Couples-are-Forever (and for octal games .6, .601, .61, .611, .62, .621, .63, .631).
 * @author Sean A. Irvine
 */
public class A046695 extends MemorySequence {

  {
    add(null); // 0 unused
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.ZERO;
    }
    final TreeSet<Long> s = new TreeSet<>();
    for (int k = 1; k <= n / 2; ++k) {
      s.add(get(k).longValueExact() ^ get(n - k).longValueExact());
    }
    return Z.valueOf(LongUtils.mex(s));
  }
}
