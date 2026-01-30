package irvine.oeis.a392;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A392156 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A392156 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final String s = p.toString();
    final HashSet<Z> set = new HashSet<>();
    for (int k = 0; k <= s.length(); ++k) {
      for (int d = k == 0 ? 1 : 0; d < 10; ++d) {
        final Z t = new Z(s.substring(0, k) + d + s.substring(k));
        if (t.isProbablePrime()) {
          set.add(t);
        }
      }
    }
    return Z.valueOf(set.size());
  }
}
