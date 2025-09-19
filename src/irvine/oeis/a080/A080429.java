package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A080429 Odd numbers such that all a(i)*a(j) with i&lt;j are distinct.
 * @author Sean A. Irvine
 */
public class A080429 extends CachedSequence {

  private final HashSet<Z> mProducts = new HashSet<>();

  /** Construct the sequence. */
  public A080429() {
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
      t = t.add(2);
      boolean ok = true;
      for (int k = 1; k < n; ++k) {
        if (mProducts.contains(a(k).multiply(t))) {
          ok = false;
          break;
        }
      }
      if (ok) {
        for (int k = 1; k < n; ++k) {
          mProducts.add(a(k).multiply(t));
        }
        return t;
      }
    }
  }
}

