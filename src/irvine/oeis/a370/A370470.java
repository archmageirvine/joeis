package irvine.oeis.a370;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A370470 In the binary expansion of n, change the i-th run length to the difference of the i-th and (i-1)-th run lengths. The first run length remains as is.
 * @author Sean A. Irvine
 */
public class A370470 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final ArrayList<Integer> lengths = new ArrayList<>();
    long m = ++mN;
    int cnt = 0;
    long bit = m & 1;
    while (m != 0) {
      if ((m & 1) == bit) {
        ++cnt;
      } else {
        lengths.add(cnt);
        cnt = 1;
        bit = m & 1;
      }
      m >>>= 1;
    }
    lengths.add(cnt);
    int pos = lengths.size() - 1;
    long res = (1L << lengths.get(pos)) - 1;
    int b = 0;
    while (pos > 0) {
      final int v = Math.abs(lengths.get(pos) - lengths.get(--pos));
      res <<= v;
      if (b == 1) {
        res += (1L << v) - 1;
      }
      b = 1 - b;
    }
    return Z.valueOf(res);
  }
}
