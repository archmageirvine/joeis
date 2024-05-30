package irvine.oeis.a025;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005245;

/**
 * A025280 Complexity of n: number of 1's required to build n using +, * and ^.
 * @author Sean A. Irvine
 */
public class A025280 extends A005245 {

  // After Alois P. Heinz

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z min = super.computeNext();
    final FactorSequence fs = Jaguar.factor(n);
    int gcd = -1;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      gcd = gcd == -1 ? e : Functions.GCD.i(gcd, e);
      if (gcd <= 1) {
        break;
      }
    }
    if (gcd > 1) {
      final Z nn = Z.valueOf(n);
      for (final Z d : Jaguar.factor(gcd).divisors()) {
        final int dd = d.intValueExact();
        if (dd > 1) {
          min = min.min(a(nn.root(dd).intValueExact()).add(a(dd)));
        }
      }
    }
    return min;
  }
}
