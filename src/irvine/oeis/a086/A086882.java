package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086882 a(n) is the period of the imaginary continued fraction expansion of sqrt(-n).
 * @author Sean A. Irvine
 */
public class A086882 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (Predicates.SQUARE.is(++mN)) {
      return Z.ZERO;
    }
    final long s = Functions.SQRT.l(mN);
    long c = mN;
    long oc = 0;
    long oa;
    long a = 0;
    long b = 0;
    long i = 0;
    long k = 0;
    while (c != oc) {
      oc = c;
      oa = a;
      a = (mN - b * b) / c;
      if (a == oa) {
        return Z.valueOf(2 * i);
      }
      k = (s - b) / a;
      i += k;
      final long d = a * k + b;
      c = (mN - d * d) / a;
      b = (s + d) % c - s;
    }
    return Z.valueOf(2 * i - k);
  }
}

