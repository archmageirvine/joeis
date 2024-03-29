package irvine.oeis.a184;
// Generated by gen_seq4.pl A183953/arronk

import irvine.math.z.Z;

/**
 * A184323 Number of strings of numbers x(i=1..8) in 0..n with sum i^2*x(i)^3 equal to 64*n^3.
 * @author Georg Fischer
 */
public class A184323 extends A184318 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(8, mN);
  }
}

