package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.a129.A129771;

/**
 * A386312 allocated for Francisco J. Mu\u00f1oz.
 * @author Sean A. Irvine
 */
public class A386312 extends A129771 {

  private boolean isDeBruijn(Z v, final int order) {
    final int m = 1 << order;
    final Z mask = Z.valueOf(m - 1);
    final Z bit = Z.ONE.shiftLeft(m);
    final boolean[] seen = new boolean[m];
    for (int k = 0; k < m; ++k) {
      final int t = v.and(mask).intValue();
      if (seen[t]) {
        return false;
      }
      seen[t] = true;
      if (v.isOdd()) {
        v = v.add(bit);
      }
      v = v.divide2();
    }
    return true;
  }

  private Z encode(final Z v) {
    Z s = Z.ZERO;
    for (int k = 0; k < 32; ++k) {
      final long r = s.mod(32);
      s = s.multiply(2).add(v.testBit((int) r) ? 1 : 0);
    }
    return s;
  }

  @Override
  public Z next() {
    while (true) {
      final Z evil = super.next();
      final Z m = evil.multiply(65535);
      if (m.bitLength() > 32) {
        return null;
      }
      if (isDeBruijn(encode(m), 5)) {
        return evil;
      }
    }
  }
}
