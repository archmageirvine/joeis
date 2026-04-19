package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084475 a(n) defines the first brilliant number, b_n, greater than 10^n. If n is odd or zero, then b_n is 10^n+a(n); and if n is a positive even number, then b_n is {10^(n/2)+a(n)}^2.
 * @author Sean A. Irvine
 */
public class A084475 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.THREE;
    }
    long k = -1;
    if ((mN & 1)== 1) {
      final Z t = Z.TEN.pow(mN);
      while (true) {
        if (Predicates.BRILLIANT.is(t.add(++k))) {
          return Z.valueOf(k);
        }
      }
    } else {
      final Z t = Z.TEN.pow(mN / 2);
      while (true) {
        if (t.add(++k).isProbablePrime()) {
          return Z.valueOf(k);
        }
      }
    }
  }
}
