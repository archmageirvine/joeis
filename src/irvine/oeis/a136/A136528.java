package irvine.oeis.a136;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A136528 a(n) = the highest possible number of positive divisors of the sum of any two distinct positive divisors of n.
 * @author Sean A. Irvine
 */
public class A136528 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Z[] div = Jaguar.factor(++mN).divisors();
    long c = 0;
    for (int k = 0; k < div.length - 1; ++k) {
      for (int j = k + 1; j < div.length; ++j) {
        final long t = Jaguar.factor(div[k].add(div[j])).sigma0AsLong();
        if (t > c) {
          c = t;
        }
      }
    }
    return Z.valueOf(c);
  }
}
