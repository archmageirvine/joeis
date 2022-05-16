package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007426 d_4(n), or tau_4(n), the number of ordered factorizations of n as n = rstu.
 * @author Sean A. Irvine
 */
public class A007426 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      for (final Z e : Jaguar.factor(d).divisors()) {
        sum = sum.add(Jaguar.factor(e).sigma0());
      }
    }
    return sum;
  }
}
