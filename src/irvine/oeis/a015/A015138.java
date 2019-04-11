package irvine.oeis.a015;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A015138 Consider Fibonacci-type sequences b(0)=X, b(1)=Y, <code>b(k)=b(k-1)+b(k-2) mod n</code>; all are periodic; sequence gives number of maximal length periods.
 * @author Sean A. Irvine
 */
public class A015138 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final HashMap<Pair<Integer, Integer>, Integer> br = new HashMap<>();
    int p = 0;
    long max = 0;
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
            if (period == max) {
              ++count;
            } else if (period >= max) {
              max = period;
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
    assert max != 0;
    return Z.valueOf(count);
  }
}
