package irvine.oeis.a015;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A015137 Consider Fibonacci-type sequences b(0)=X, b(1)=Y, b(k)=b(k-1)+b(k-2) mod n; all are periodic; sequence gives number of nontrivial periods of minimal length.
 * @author Sean A. Irvine
 */
public class A015137 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final HashMap<Pair<Integer, Integer>, Integer> br = new HashMap<>();
    int p = 0;
    long min = Long.MAX_VALUE;
    long count = 0;
    for (int x = 0; x < mN; x++) {
      for (int y = x; y < mN; y++) {
        int a = x;
        int b = y;
        int period = 0;
        Pair<Integer, Integer> s = new Pair<>(x, y);
        while (true) {
          final Integer q = br.put(s, p);
          if (q != null) {
            if (period == min) {
              ++count;
            } else if (period > 1 && period <= min) {
              min = period;
              count = 1;
            }
            ++p;
            break;
          }
          final int t = a;
          a = b;
          b = (t + a) % mN;
          s = new Pair<>(a, b);
          ++period;
        }
      }
    }
    assert min != Long.MAX_VALUE;
    return Z.valueOf(count);
  }
}
