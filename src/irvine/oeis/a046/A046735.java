package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046735 Nontrivial (i.e., having no nontrivial factors with this property) integers which do not divide any terms of A000213.
 * @author Sean A. Irvine
 */
public class A046735 extends Sequence1 {

  // After Charles R Greathouse IV

  private long mN = 1;

  private boolean isNondivisor(final long n) {
    long a = 1;
    long b = 1;
    long c = 1;
    for (long k = 1; k < n * n; ++k) {
      final long t = (a + b + c) % n;
      if (t == 0) {
        return false;
      }
      a = b;
      b = c;
      c = t;
      if (c == 1 && b == 1 && a == 1) {
        return true;
      }
    }
    throw new RuntimeException();
  }

  @Override
  public Z next() {
    while (true) {
      for (final Z dd : Jaguar.factor(++mN).divisors()) {
        final long d = dd.longValue();
        if (d > 1 && isNondivisor(d)) {
          if (d == mN) {
            return Z.valueOf(mN);
          } else {
            break;
          }
        }
      }
    }
  }
}
