package irvine.oeis.a082;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A082931 a(1) = 1; a(n) = least k &gt; a(n-1) such that a(i)+k is prime for some i &lt; n and each prime of form a(i)+a(j) occurs for unique i &lt;= j.
 * @author Sean A. Irvine
 */
public class A082931 extends CachedSequence {

  private final HashSet<Z> mSums = new HashSet<>();

  /** Construct the sequence. */
  public A082931() {
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
        ok = false;
        for (Z v : values()) {
          if (v.add(t).isProbablePrime()) {
            ok = true;
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
}

