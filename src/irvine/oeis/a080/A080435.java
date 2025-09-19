package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A080435 a(1) = 1; a(n) = least k &gt; a(n-1) such that each prime of form a(i)+a(j) occurs for unique i &lt;= j.
 * @author Sean A. Irvine
 */
public class A080435 extends CachedSequence {

  private final HashSet<Z> mSums = new HashSet<>();

  /** Construct the sequence. */
  public A080435() {
    super(1);
  }

  @Override
  protected Z compute(final Z nn) {
    final int n = nn.intValueExact();
    if (n <= 1) {
      return Z.ONE;
    }
    Z t = a(n - 1);
    while (true) {
      t = t.add(1);
      boolean ok = true;
      for (int k = 1; k < n; ++k) {
        if (mSums.contains(a(k).add(t))) {
          ok = false;
          break;
        }
      }
      if (ok) {
        for (int k = 1; k < n; ++k) {
          final Z u = a(k).add(t);
          if (u.isProbablePrime()) {
            mSums.add(a(k).add(t));
          }
        }
        return t;
      }
    }
  }
}

