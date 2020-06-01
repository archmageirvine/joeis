package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003033 Smallest integer m such that the product of every 4 consecutive integers <code>&gt;</code> m has a prime factor <code>&gt; prime(n)</code>.
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
