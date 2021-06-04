package irvine.oeis.a048;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A048186 Order of omnipower group mod A048184(n).
 * @author Sean A. Irvine
 */
public class A048186 extends A048184 {

  // There is probably a better way ...

  @Override
  public Z next() {
    final Z p = super.next();
    final int lim = p.subtract(1).divide2().intValueExact();
    final TreeSet<Z> active = new TreeSet<>();
    for (Z m = Z.TWO; m.compareTo(p) < 0; m = m.add(1)) {
      active.add(m);
    }
    for (int t = 2; t < lim; ++t) {
      final TreeSet<Z> retain = new TreeSet<>();
      for (Z m = Z.TWO; m.compareTo(p) < 0; m = m.add(1)) {
        retain.add(m.modPow(Z.valueOf(t), p));
      }
      active.retainAll(retain);
    }
    return Z.valueOf(active.size() + 1);
  }
}
