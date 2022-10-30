package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047976 Let (p1,p2), (p3,p4) be pairs of twin primes with p1*p2=p3+p4-1; sequence gives values of p1.
 * @author Sean A. Irvine
 */
public class A047976 extends A047975 {

  {
    setOffset(1);
  }

  @Override
  protected Z select(final Z gap, final Z p1, final Z p3) {
    return p1;
  }

  @Override
  protected boolean accept(final Z gap) {
    return Z.TWO.equals(gap);
  }
}
