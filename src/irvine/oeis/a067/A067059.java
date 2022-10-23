package irvine.oeis.a067;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067059 Square array read by antidiagonals of partitions which half fill an n*k box, i.e., partitions of floor(nk/2) or ceiling(nk/2) into up to n positive integers, each no more than k.
 *
 * @author Sean A. Irvine
 */
public class A067059 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    long cnt = 0;
    final int t = n * m / 2;
    if (t <= 0) {
      return Z.ONE;
    }
    final IntegerPartition part = new IntegerPartition(t);
    int[] p;
    while ((p = part.next()) != null) {
      if (p.length <= n && p[0] <= m) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
