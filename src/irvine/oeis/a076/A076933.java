package irvine.oeis.a076;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076933 Final number obtained when n is divided by its divisors starting from the smallest one in increasing order until one no longer gets an integer.
 * @author Sean A. Irvine
 */
public class A076933 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    for (final Z dd : Jaguar.factor(mN).divisorsSorted()) {
      final long d = dd.longValue();
      if (m % d != 0) {
        break;
      }
      m /= d;
    }
    return Z.valueOf(m);
  }
}

