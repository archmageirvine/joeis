package irvine.oeis.a067;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A067899 Fractal palindromic primes of second order.
 * @author Sean A. Irvine
 */
public class A067899 extends A002385 {

  private final HashSet<Z> mReducible = new HashSet<>();
  private final TreeSet<Z> mPriority = new TreeSet<>();

  @Override
  public Z next() {
    while (mPriority.isEmpty()) {
      final Z p = super.next();
      final String s = p.toString();
      for (int d = 0; d < 10; ++d) {
        final String r = s + d + s;
        final Z q = new Z(r);
        if (q.isProbablePrime()) {
          for (int e = 0; e < 10; ++e) {
            final Z t = new Z(r + e + r);
            if (t.isProbablePrime()) {
              if (mReducible.contains(p) || mReducible.contains(q)) {
                mReducible.add(t);
              } else {
                mPriority.add(t);
              }
            }
          }
        }
      }
    }
    final Z res = mPriority.pollFirst();
    mReducible.add(res);
    return res;
  }
}
