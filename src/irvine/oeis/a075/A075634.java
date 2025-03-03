package irvine.oeis.a075;

import java.util.TreeSet;

import irvine.math.z.QuadraticCongruence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075634 Final terms of groups in A075631.
 * @author Sean A. Irvine
 */
public class A075634 extends Sequence1 {

  private Z mSum = null;
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
      return Z.ONE;
    } else {
      final Z mod = mSum.multiply2();
      final TreeSet<Z> min = new TreeSet<>();
      for (final Z t : QuadraticCongruence.solve(Z.ONE, Z.ONE, mod.subtract(mN.multiply(mN.add(1))), mod)) {
        Z u = t;
        while (u.compareTo(mN) <= 0) {
          u = u.add(mod);
        }
        min.add(u);
      }
      final Z m = min.first();
      mSum = m.add(mN).add(1).multiply(m.subtract(mN)).divide2();
      mN = m;
    }
    return mN;
  }
}
