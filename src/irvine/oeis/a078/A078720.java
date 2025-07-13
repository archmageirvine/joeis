package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078720 Integer part of the ratio of even to odd terms among n, f(n), f(f(n)), ...., 1 for the Collatz function (that is, until reaching "1" for the first time), or -1 if 1 is never reached.
 * @author Sean A. Irvine
 */
public class A078720 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    long odd = 1;
    long even = 0;
    while (!Z.ONE.equals(m)) {
      m = m.makeOdd();
      even += m.auxiliary();
      if (Z.ONE.equals(m)) {
        return Z.valueOf(even / odd);
      }
      m = m.multiply(3).add(1);
      ++odd;
    }
    return Z.valueOf(even / odd);
  }
}
