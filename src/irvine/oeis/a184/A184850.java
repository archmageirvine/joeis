package irvine.oeis.a184;
// Generated by gen_seq4.pl A183953/arronk

import irvine.math.z.Z;

/**
 * A184850 Number of strings of numbers x(i=1..6) in 0..n with sum i*x(i)^4 equal to 6*n^4.
 * @author Georg Fischer
 */
public class A184850 extends A184848 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(6, mN);
  }
}

