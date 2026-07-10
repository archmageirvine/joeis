package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.math.api.Set;
import irvine.math.group.IntegersModMul;
import irvine.math.set.FiniteSet;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A085794.
 * @author Sean A. Irvine
 */
public class A085798 extends FilterNumberSequence {

  // todo theorem in paper incomplete?

  private static final FiniteSet<Z> S = new FiniteSet<>(Z.SIX, Z.valueOf(32));

  /** Construct the sequence. */
  public A085798() {
    super(1, k -> {
      if (k == 1) {
        return true;
      }
      final long m = 10L * k + 1;
      for (final Z p : Jaguar.factor(m).toZArray()) {
        final IntegersModMul r = new IntegersModMul(p);
        final Set<Z> s = r.generateSubgroup(S);
        if (s.contains(Z.TWO) || s.contains(p.subtract(2))) {
//          if (k == 12) {
//            System.out.println(k + " " + p + " " + s.asList());
//          }
          return false;
        }
        if (s.contains(Z.FIVE) || s.contains(p.subtract(5))) {
          return false;
        }
        final Z v2 = Z.FIVE.modMultiply(Z.TWO.modInverse(p), p);
        if (s.contains(v2) || s.contains(p.subtract(v2))) {
          return false;
        }
        final Z v3 = Z.FIVE.modMultiply(Z.THREE.modInverse(p), p);
        if (s.contains(v3) || s.contains(p.subtract(v3))) {
          return false;
        }
        final Z v4 = Z.FIVE.modMultiply(Z.FOUR.modInverse(p), p);
        if (s.contains(v4) || s.contains(p.subtract(v4))) {
          return false;
        }
      }
      return true;
    });
  }
}
