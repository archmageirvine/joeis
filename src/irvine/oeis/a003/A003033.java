package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003033.
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
