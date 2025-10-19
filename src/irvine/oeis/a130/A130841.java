package irvine.oeis.a130;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A130841 Number of ways to write n as a sum of oterms, where an oterm is an ordered product of (1+oterm), sorted by size and an empty product has value 1.
 * @author Sean A. Irvine
 */
public class A130841 extends CachedSequence {

  /** Construct the sequence. */
  public A130841() {
    super(1);
  }

  private Z mSum = Z.ZERO;

  private void search(final int n, final int m, final Z prod) {
    if (n == 1) {
      mSum = mSum.add(prod);
      return;
    }
    for (int k = m; k <= n; ++k) {
      if (n % k == 0) {
        search(n / k, k, prod.multiply(a(k - 1)));
      }
    }
  }

  @Override
  protected Z compute(final Z nn) {
    final int n = nn.intValueExact();
    if (n == 1) {
      return Z.ONE;
    }
    mSum = Z.ZERO;
    search(n, 2, Z.ONE);
    return mSum;
  }
}
