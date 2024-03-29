package irvine.oeis.a184;
// Generated by gen_seq4.pl A183953/arronk

import irvine.math.z.Z;

/**
 * A184305 Number of strings of numbers x(i=1..4) in 0..n with sum i^3*x(i)^2 equal to 64*n^2.
 * @author Georg Fischer
 */
public class A184305 extends A184303 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(4, mN);
  }
}

