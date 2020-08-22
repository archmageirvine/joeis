package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003033 Smallest integer m such that the product of every 4 consecutive integers &gt; m has a prime factor &gt; prime(n).
 * @author Sean A. Irvine
 */
public class A003033 extends A003032 {

  protected int getNumberOfConsecutivePrimes() {
    return 4;
  }

  protected Z firstPrime() {
    return Z.THREE;
  }

}
