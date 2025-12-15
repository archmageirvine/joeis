package irvine.oeis.a082;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A082589 Fractal palindromic primes of third order.
 * @author Sean A. Irvine
 */
public class A082589 extends A002385 {

  private final HashSet<Z> mReducible = new HashSet<>();
  private final TreeSet<Z> mPriority = new TreeSet<>();

  @Override
  public Z next() {
    while (mPriority.isEmpty()) {
      final Z p = super.next();
      final String s = p.toString();
      for (int d = 0; d < 10; ++d) {
        final String r = s + d + s;
        final Z rz = new Z(r);
        if (rz.isProbablePrime()) {
          for (int e = 0; e < 10; ++e) {
            final String q = r + e + r;
            final Z qz = new Z(q);
            if (qz.isProbablePrime()) {
              for (int f = 0; f < 10; ++f) {
                final Z t = new Z(q + f + q);
                if (t.isProbablePrime()) {
                  if (mReducible.contains(p) || mReducible.contains(qz) || mReducible.contains(rz)) {
                    mReducible.add(t);
                  } else {
                    mPriority.add(t);
                  }
                }
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
