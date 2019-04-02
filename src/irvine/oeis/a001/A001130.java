package irvine.oeis.a001;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashMap;

/**
 * A001130 Number of graphical basis partitions of 2n.
 * @author Sean A. Irvine
 */
public class A001130 implements Sequence {

  private long mN = 0;

  private final HashMap<String, Z> mCache = new HashMap<>();

  private Z h(final long n, final long d, final long t, final long s) {
    //System.out.println("h(" + n + "," + d + "," + t + "," + s + ")");
    final long ds = d * d;
    if (n <= ds) {
      if (n < ds) {
        return Z.ZERO;
      }
      return t <= -1 && s <= -d * (1 + t) ? Z.ONE : Z.ZERO;
    }
    if (n > d && d == 1) {
      if (n + t + s <= 0) {
        return Z.TWO;
      } else if (t + s + 2 - n <= 0) {
        return Z.ONE;
      } else {
        return Z.ZERO;
      }
    }
    if (d == 0) {
      return Z.ZERO;
    }
    assert ds > 1;
    assert n > ds;
    final String key = n + "_" + d + "_" + t + "_" + s;
    final Z c = mCache.get(key);
    if (c != null) {
      return c;
    }
    Z r = Z.ZERO;
    final long u = (n - ds) / d;
    for (long j = -u; j <= u; ++j) {
      r = r.add(h(n - d * (2 + Math.abs(j)) + 1, d - 1, t + j, Math.max(0, s + t + j + 1)));
    }
    mCache.put(key, r);
    return r;
  }

  @Override
  public Z next() {
    mN += 2;
    Z t = Z.ZERO;
    for (long d = 0; d <= LongUtils.sqrt(mN); ++d) {
      t = t.add(h(mN, d, 0, 0));
    }
    return t;
  }
}

