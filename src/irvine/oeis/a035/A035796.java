package irvine.oeis.a035;

import java.util.HashSet;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a025.A025487;

/**
 * A035796 Words over signatures (derived from multisets and multinomials).
 * @author Sean A. Irvine
 */
public class A035796 extends A025487 {

  // After Andrew Howroyd

  private final PrimeDivision mFactor = new PrimeDivision();

  private Z c(final int[] sig) {
    final int s = Functions.SUM.i(sig);
    Z t = Binomial.binomial(s, sig.length).multiply(Functions.FACTORIAL.z(sig.length)).multiply(Functions.FACTORIAL.z(s));
    final HashSet<Integer> seen = new HashSet<>();
    for (final int v : sig) {
      t = t.divide(Functions.FACTORIAL.z(v));
      seen.add(v);
    }
    for (final int v : seen) {
      int c = 0;
      for (final int u : sig) {
        if (u == v) {
          ++c;
        }
      }
      t = t.divide(Functions.FACTORIAL.z(c));
    }
    return t;
  }

  @Override
  public Z next() {
    final Z t = super.next();
    if (Z.ONE.equals(t)) {
      return Z.ONE;
    }
    final FactorSequence fs = mFactor.factor(t);
    final int[] sig = new int[fs.omega()];
    int k = 0;
    for (final Z p : fs.toZArray()) {
      sig[k++] = fs.getExponent(p);
    }
    return c(sig);
  }
}

