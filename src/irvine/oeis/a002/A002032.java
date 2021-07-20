package irvine.oeis.a002;

import java.util.HashMap;

import irvine.math.graph.GraphUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A002032 Number of n-colored connected graphs on n labeled nodes.
 * @author Sean A. Irvine
 */
public class A002032 implements Sequence {

  private static final HashMap<Pair<Long, Long>, Z> F = new HashMap<>();

  static Z f(final long n, final long k) {
    if (k == 1) {
      return n == 1 ? Z.ONE : Z.ZERO;
    }
    if (k > n) {
      return Z.ZERO;
    }
    final Pair<Long, Long> key = new Pair<>(n, k);
    final Z r = F.get(key);
    if (r != null) {
      return r;
    }
    Z s = Z.ZERO;
    for (long j = 1; j <= k; ++j) {
      final Z t = Binomial.binomial(k, j).multiply(GraphUtils.numberConnectedLabelledColoured(n, j));
      s = s.signedAdd(((k - j) & 1) == 0, t);
    }
    F.put(key, s);
    return s;
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return f(mN, mN);
  }
}

