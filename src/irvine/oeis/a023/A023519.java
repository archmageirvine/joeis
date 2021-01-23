package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A023519 Least odd prime divisor of prime(n)*prime(n-1) - 1, or 1 if prime(n)*prime(n-1) - 1 is a power of 2.
 * @author Sean A. Irvine
 */
public class A023519 extends A023515 {

  @Override
  public Z next() {
    final Z[] p = Cheetah.factor(super.next().makeOdd()).toZArray();
    return p.length == 0 ? Z.ONE : p[0];
  }
}
