package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058050 a(n) is the number of different graphs drawn in the following way: you decide for each number k &lt;= n on a pair of positive numbers (x(k),y(k)) such that x(k)+y(k)=k; you draw n points numbered 1 to n; draw two arrows from n, one to x(n) and one to y(n); draw two arrows from each k already reached by an arrow, one to x(k) and one to y(k). The process stops when 1 is the only point reached by an arrow without any arrow leaving it; you can also erase the isolated points.
 * @author Sean A. Irvine
 */
public class A058050 extends Sequence1 {

  // It would be possible to squeeze one more bit here as bit 0 is not currently used.
  // It would be possible to cache smaller results to make it faster.

  private int mN = 0;

  private long count(final long bits, final int pos) {
    // pos counts down from the number of vertices
    // bits is a set indicating which vertices are not isolated, and thus
    // controls which vertices need to be expanded.
    if (pos <= 1) {
      return 1;
    }
    final long b = 1L << pos;
    if ((bits & b) == 0) {
      return count(bits, pos - 1);
    } else {
      long cnt = 0;
      for (int x = 1; x <= pos / 2; ++x) {
        cnt += count(bits | (1L << x) | 1L << (pos - x), pos - 1);
      }
      return cnt;
    }
  }

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(count(1L << mN, mN));
  }
}
