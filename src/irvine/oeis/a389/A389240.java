package irvine.oeis.a389;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389240 allocated for James C. McMahon.
 * @author Sean A. Irvine
 */
public class A389240 extends Sequence1 {

  private static final long[] SMALL = {0, 1, 3, 2};
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= SMALL.length) {
      return Z.valueOf(SMALL[(int) (mN - 1)]);
    }
    long m = -1;
    final ArrayList<Long> seq = new ArrayList<>();
    seq.add(mN);
    while (true) {
      long x = seq.get(seq.size() - 1);
      if ((x & 1) == 0) {
        x >>>= 1;
      } else {
        m += 2;
        x += m;
      }
      seq.add(x);
      if (seq.size() >= 4) {
        final long a = seq.get(seq.size() - 4);
        final long b = seq.get(seq.size() - 3);
        final long c = seq.get(seq.size() - 2);
        final long d = seq.get(seq.size() - 1);
        if (d <= 1 || (a == c - 2 && b == d - 4)) {
          return d == 1 ? Z.valueOf(seq.size() - 1) : Z.NEG_ONE;
        }
      }
    }
  }
}
