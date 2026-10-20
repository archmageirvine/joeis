package irvine.oeis.a086;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A086925 a(1) = 1; a(n+1) = a(n)/spf(a(n)) + number of earlier occurrences of a(n), spf=A020639 = smallest prime factor.
 * @author Sean A. Irvine
 */
public class A086925 extends CachedSequence {

  private final HashMap<Z, Integer> mCounts = new HashMap<>();

  /** Construct the sequence. */
  public A086925() {
    super(1);
  }

  @Override
  protected Z compute(final Z nn) {
    final long n = nn.longValueExact();
    final Z res;
    if (n == 1) {
      res = Z.ONE;
    } else {
      final Z an = a(n - 1);
      res = an.divide(Functions.LPF.z(an)).add(mCounts.get(an));
    }
    mCounts.merge(res, 1, Integer::sum);
    return res;
  }
}
