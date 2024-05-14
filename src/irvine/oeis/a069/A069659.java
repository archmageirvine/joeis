package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069659 Largest n-digit perfect power.
 * @author Sean A. Irvine
 */
public class A069659 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    final Z t = mA.subtract(1);
    int root = 1;
    Z best = Z.ZERO;
    while (true) {
      final Z r = t.root(++root);
      if (r.compareTo(Z.ONE) <= 0) {
        return best;
      }
      final Z u = r.pow(root);
      if (u.compareTo(best) > 0) {
        best = u;
      }
    }
  }
}

