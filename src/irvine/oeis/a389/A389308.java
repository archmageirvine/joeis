package irvine.oeis.a389;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A389308 Lexicographically earliest sequence, where a(n+1) - a(n) is unique and if a(i) = a(n+1), i &lt;= n, then the minimal n+1 - i is also unique.
 * @author Sean A. Irvine
 */
public class A389308 extends CachedSequence {

  private final HashSet<Z> mADiffs = new HashSet<>();
  private final HashSet<Integer> mIDiffs = new HashSet<>();

  /** Construct the sequence. */
  public A389308() {
    super(1);
  }

  @Override
  protected Z compute(final Z nn) {
    final int n = nn.intValueExact();
    if (n == 1) {
      return Z.ZERO;
    }
    final Z a1 = a(n - 1);
    Z v = Z.ZERO;
    while (true) {
      final Z d = v.subtract(a1);
      if (!mADiffs.contains(d)) {
        // a(n+1) - a(n) is unique
        boolean ok = true;
        for (int k = n - 1; k > 0; --k) {
          if (a(k).equals(v)) {
            if (mIDiffs.add(n - k)) {
              mADiffs.add(d);
              return v;
            } else {
              ok = false;
              break;
            }
          }
        }
        if (ok) {
          mADiffs.add(d);
          return v;
        }
      }
      v = v.add(1);
    }
  }
}

