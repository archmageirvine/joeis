package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.Permutation;

/**
 * A390697 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A390697 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z prime = super.next();
      final Permutation perm = Permutation.permuter(prime);
      final StringBuilder sb = new StringBuilder();
      int[] p;
      while ((p = perm.next()) != null) {
        final Z q = Permutation.permToZ(p);
        if (q.isProbablePrime()) {
          sb.append(q);
        }
      }
      final Z q = new Z(sb);
      if (q.isProbablePrime()) {
        return prime;
      }
    }
  }
}
