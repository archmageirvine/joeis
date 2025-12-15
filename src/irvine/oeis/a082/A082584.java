package irvine.oeis.a082;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A082584 Fractal palindromic primes of first order.
 * @author Sean A. Irvine
 */
public class A082584 extends A002385 {

  private final HashSet<Z> mReducible = new HashSet<>();
  private final TreeSet<Z> mPriority = new TreeSet<>();

  @Override
  public Z next() {
    while (mPriority.isEmpty()) {
      final Z p = super.next();
      final String s = p.toString();
      for (int d = 0; d < 10; ++d) {
        final Z t = new Z(s + d + s);
        if (t.isProbablePrime()) {
          if (mReducible.contains(p)) {
            mReducible.add(t);
          } else {
            mPriority.add(t);
          }
        }
      }
    }
    final Z res = mPriority.pollFirst();
    mReducible.add(res);
    return res;
  }
}
