package irvine.oeis.a392;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A392476 allocated for Austin Blake.
 * @author Sean A. Irvine
 */
public class A392476 extends CachedSequence {

  private final Map<Z, Integer> mCounts = new HashMap<>();

  /** Construct the sequence. */
  public A392476() {
    super(0);
  }

  @Override
  protected Z compute(final Z nn) {
    final int n = nn.intValueExact();
    if (n == 0) {
      mCounts.put(nn, 1);
      return Z.ZERO;
    }
    final int cnt = mCounts.get(a(n - 1));
    final Z t = cnt == 1 ? a(n - 1).subtract(a(a(n - 1))) : Z.valueOf(cnt);
    mCounts.merge(t, 1, Integer::sum);
    return t;
  }
}


