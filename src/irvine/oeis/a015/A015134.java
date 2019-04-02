package irvine.oeis.a015;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A015134 Consider Fibonacci-type sequences b(0)=X, b(1)=Y, b(k)=b(k-1)+b(k-2) mod n; all are periodic; sequence gives number of distinct periods.
 * @author Sean A. Irvine
 */
public class A015134 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final HashMap<Pair<Integer, Integer>, Integer> br = new HashMap<>();
    int p = 0;
    long count = 0;
    for (int x = 0; x < mN; x++) {
      for (int y = x; y < mN; y++) {
        int a = x;
        int b = y;
        Pair<Integer, Integer> s = new Pair<>(x, y);
        while (true) {
          final Integer q = br.put(s, p);
          if (q != null) {
            if (q == p) {
              ++count;
            }
            ++p;
            break;
          }
          final int t = a;
          a = b;
          b = (t + a) % mN;
          s = new Pair<>(a, b);
        }
      }
    }
    return Z.valueOf(count);
  }
}
