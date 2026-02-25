package irvine.oeis.a392;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A392621 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A392621 extends A001597 {

  @Override
  public Z next() {
    final Z t = super.next();
    if (t.isOne()) {
      return Z.ONE;
    }
    final HashSet<Z> set = new HashSet<>();
    final FactorSequence fs = Jaguar.factor(t);
    for (final Z d : fs.divisors()) {
      if (!d.isOne()) {
        Z u = d.square();
        while (u.compareTo(t) < 0) {
          u = u.multiply(d);
        }
        if (u.equals(t)) {
          set.add(d);
        }
      }
    }
    return Functions.PRODUCT.z(set);
  }
}
