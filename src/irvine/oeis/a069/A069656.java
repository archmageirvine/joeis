package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;
import irvine.util.Permutation;

/**
 * A069656 Perfect powers that can be permuted into another perfect power (in base 10).
 * @author Sean A. Irvine
 */
public class A069656 extends A001597 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Permutation perm = Permutation.permuter(t);
      int[] p;
      while ((p = perm.next()) != null) {
        if (p[0] != 0) {
          final Z u = Permutation.permToZ(p);
          if (!u.equals(t) && u.isPower() != null) {
            return t;
          }
        }
      }
    }
  }
}

