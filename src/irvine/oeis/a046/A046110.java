package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046110 Number of lattice points on circumference of a circle of radius (2n+1)/2 with center at (1/2,0).
 * @author Sean A. Irvine
 */
public class A046110 extends A046080 {

  /** Construct the sequence. */
  public A046110() {
    super(0);
  }

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    return t.multiply(4).add(2);
  }
}
