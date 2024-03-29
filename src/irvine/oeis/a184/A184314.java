package irvine.oeis.a184;
// Generated by gen_seq4.pl A183953/arronk

import irvine.math.z.Z;

/**
 * A184314 Number of strings of numbers x(i=1..n) in 0..5 with sum i^2*x(i)^3 equal to n^2*125.
 * @author Georg Fischer
 */
public class A184314 extends A184318 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, 5);
  }
}

