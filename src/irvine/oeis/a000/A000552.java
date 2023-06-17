package irvine.oeis.a000;

import java.util.HashMap;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000552 Number of labeled rooted trees of height 3 with n nodes.
 * @author Sean A. Irvine
 */
public class A000552 extends AbstractSequence {

  /* Construct the sequence. */
  public A000552() {
    super(4);
  }

  private static Z ss(final int p, final int h) {
    Z s = Z.ZERO;
    for (int k = 1; k < p; ++k) {
      s = s.add(Binomial.binomial(p, k)
                .multiply(k)
                .multiply(s(p - k, h))
                .multiply(s(k, h - 1)));
    }
    return s.divide(p - 1);
  }

  private static final HashMap<String, Z> CACHE = new HashMap<>();

  static Z s(final int p, final int h) {
    if (h >= p) {
      return Z.valueOf(p).pow(p - 1);
    }
    if (p <= 1) {
      return Z.ZERO;
    }
    final String key = p + "_" + h;
    final Z r = CACHE.get(key);
    if (r != null) {
      return r;
    }
    final Z s = ss(p, h);
    CACHE.put(key, s);
    return s;
  }

  private int mN = 3;

  @Override
  public Z next() {
    ++mN;
    return s(mN, 4).subtract(s(mN, 3));
  }
}
