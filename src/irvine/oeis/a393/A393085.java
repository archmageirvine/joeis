package irvine.oeis.a393;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A393085 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A393085 extends A001597 {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Z t = super.next();
      if (t.isOne()) {
        mA.add(Z.ONE);
      } else {
        final FactorSequence fs = Jaguar.factor(t);
        for (final Z d : fs.divisors()) {
          if (!d.isOne()) {
            Z u = d.square();
            while (u.compareTo(t) < 0) {
              u = u.multiply(d);
            }
            if (u.equals(t)) {
              mA.add(Functions.VALUATION.z(t, d));
            }
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
