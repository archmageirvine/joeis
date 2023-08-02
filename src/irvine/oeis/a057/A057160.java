package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057160 Smallest value of k for which the expression k*2^(2^n-1)-1 is prime.
 * @author Sean A. Irvine
 */
public class A057160 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft((1L << ++mN) - 1);
    long k = 0;
    Z u = Z.NEG_ONE;
    do {
      u = u.add(t);
      ++k;
    } while (!u.isProbablePrime());
    return Z.valueOf(k);
  }
}

