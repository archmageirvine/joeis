package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047978 Let (p1,p2), (p3,p4) be pairs of twin primes with p1*p2=p3+p4-1; sequence gives values of p3.
 * @author Sean A. Irvine
 */
public class A047978 extends A047975 {

  @Override
  protected Z select(final Z gap, final Z p1, final Z p3) {
    return p3;
  }
}
