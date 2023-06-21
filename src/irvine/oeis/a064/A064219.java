package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064219 a(1) = 1; a(n) &gt; 0; for each k from 1 to n, k divides a(n) or a(n)+1 and a(n) is the least such integer.
 * @author Sean A. Irvine
 */
public class A064219 extends Sequence1 {

  private long mN = 0;
  private Z mLcm = Z.ONE;
  private Z mBest = null;

  private void search(final Z a, final Z b, final long k) {
    final Z d = a.gcd(b);
    if (!Z.ONE.equals(d)) {
      return;
    }
    if (k <= 1) {
      final Z[] egcd = a.extendedGcd(b);
      assert egcd[0].equals(Z.ONE);
      final Z v = a.multiply(egcd[1]);
      final Z u = b.multiply(egcd[2]);
      final Z m = v.abs().min(u.abs());
      if (mBest == null || m.compareTo(mBest) < 0) {
        mBest = m;
      }
      final Z v1 = v.subtract(mLcm).abs();
      final Z u1 = u.subtract(mLcm).abs();
      final Z m1 = v1.abs().min(u1.abs());
      if (!m1.isZero() && (mBest == null || m1.compareTo(mBest) < 0)) {
        mBest = m1;
      }
      return;
    }
    if (mBest != null) {
      if (a.compareTo(mBest) >= 0) {
        return;
      }
      if (b.compareTo(mBest) >= 0) {
        return;
      }
    }
    final Z zk = Z.valueOf(k);
    search(a.lcm(zk), b, k - 1);
    search(a, b.lcm(zk), k - 1);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    mLcm = mLcm.lcm(Z.valueOf(mN));
    mBest = null;
    search(Z.ONE, Z.ONE, mN);
    return mBest;
  }
}
