package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077369 Smallest n-digit triangular number whose external digits as well as internal digits form triangular numbers, or -1 if no such number exists.
 * @author Sean A. Irvine
 */
public class A077369 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ZERO : Z.TEN;
    }
    final Z min = Z.TEN.pow(mN);
    final Z max = min.multiply(10);
    Z ti = Functions.TRINV.z(min);
    while (true) {
      final Z t = Functions.TRIANGULAR.z(ti);
      if (t.compareTo(max) >= 0) {
        return Z.NEG_ONE; // probably never happens
      }
      if (t.compareTo(min) >= 0) {
        final String ts = t.toString();
        if (Predicates.TRIANGULAR.is((ts.charAt(0) - '0') * 10 + ts.charAt(ts.length() - 1) - '0') && Predicates.TRIANGULAR.is(new Z(ts.substring(1, ts.length() - 1)))) {
          return t;
        }
      }
      ti = ti.add(1);
    }
  }
}
