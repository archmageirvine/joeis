package irvine.oeis.a184;
// Generated by gen_seq4.pl A183953/arronk

import irvine.math.z.Z;

/**
 * A184307 Number of strings of numbers x(i=1..6) in 0..n with sum i^3*x(i)^2 equal to 216*n^2.
 * @author Georg Fischer
 */
public class A184307 extends A184303 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(6, mN);
  }
}

