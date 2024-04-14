package irvine.oeis.a004;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A004170 Reversals of Fibonacci numbers (sorted).
 * @author Sean A. Irvine
 */
public class A004170 extends A000045 {

  // Fibonacci numbers can end in trailing zeros, so it is not so easy to know
  // in advance how many must be read before we can safely output the next
  // number.  Here we do an initial run up, and thereafter accumulate entries
  // twice as fast as we output them.  A safety check has been added to detect
  // if we every make a mistake.  Another problem (which occurs with 1) is that
  // a number may need to be output more than once.

  private final TreeMap<Z, Integer> mPriority = new TreeMap<>();
  private Z mPrev = Z.ZERO;

  private void add(final Z n) {
    final Integer c = mPriority.get(n);
    if (c == null) {
      mPriority.put(n, 1);
    } else {
      mPriority.remove(n);
      mPriority.put(n, c + 1);
    }
  }

  private Z get() {
    final Map.Entry<Z, Integer> e = mPriority.pollFirstEntry();
    if (e.getValue() > 1) {
      mPriority.put(e.getKey(), e.getValue() - 1);
    }
    return e.getKey();
  }

  {
    for (int k = 0; k < 100; ++k) {
      add(Functions.REVERSE.z(super.next()));
    }
  }

  @Override
  public Z next() {
    add(Functions.REVERSE.z(super.next()));
    add(Functions.REVERSE.z(super.next()));
    final Z fr = get();
    if (fr.compareTo(mPrev) < 0) {
      throw new UnsupportedOperationException("Out of order: " + fr);
    }
    mPrev = fr;
    return fr;
  }
}
