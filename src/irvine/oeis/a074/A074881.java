package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a057.A057731;

/**
 * A074881 Triangle T(n,k) giving number of labeled cyclic subgroups of order k in symmetric group S_n, n &gt;= 1, 1 &lt;= k &lt;= g(n), where g(n) = A000793(n) is Landau's function.
 * @author Sean A. Irvine
 */
public class A074881 extends A057731 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isZero()) {
        return t.divide(Functions.PHI.l(mM));
      }
    }
  }
}
