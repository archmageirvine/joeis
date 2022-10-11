package irvine.oeis.a054;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A054269 Length of period of continued fraction for sqrt(prime(n)).
 * @author Sean A. Irvine
 */
public class A054269 extends A000040 {

  protected Z mP = null;

  @Override
  public Z next() {
    mP = super.next();
    final Z[] sqrt = mP.sqrtAndRemainder();
    final Z f0 = sqrt[0];
    Z f = f0;
    final ArrayList<Z> p = new ArrayList<>();
    p.add(Z.ZERO);
    final ArrayList<Z> q = new ArrayList<>();
    q.add(Z.ONE);
    int k = 0;
    while (true) {
      p.add(q.get(k).multiply(f).subtract(p.get(k)));
      q.add(mP.subtract(p.get(k + 1).square()).divide(q.get(k)));
      ++k;
      for (int i = 0; i < k; ++i) {
        if (p.get(i).equals(p.get(k)) && q.get(i).equals(q.get(k))) {
          return Z.valueOf(k - i);
        }
      }
      f = p.get(k).add(f0).divide(q.get(k));
    }
  }
}
