package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A080432 Even numbers such that all a(i) + a(j) are distinct.
 * @author Sean A. Irvine
 */
public class A080432 extends CachedSequence {

  private final HashSet<Z> mSums = new HashSet<>();

  /** Construct the sequence. */
  public A080432() {
    super(1);
  }

  @Override
  protected Z compute(final Z nn) {
    final int n = nn.intValueExact();
    if (n <= 1) {
      return Z.TWO;
    }
    Z t = a(n - 1);
    while (true) {
      t = t.add(2);
      boolean ok = true;
      for (int k = 1; k < n; ++k) {
        if (mSums.contains(a(k).add(t))) {
          ok = false;
          break;
        }
      }
      if (ok) {
        for (int k = 1; k < n; ++k) {
          mSums.add(a(k).add(t));
        }
        return t;
      }
    }
  }
}

