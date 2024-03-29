package irvine.oeis.a184;
// Generated by gen_seq4.pl A183953/arronk

import irvine.math.z.Z;

/**
 * A184352 Number of strings of numbers x(i=1..6) in 0..n with sum i^4*x(i) equal to 1296*n.
 * @author Georg Fischer
 */
public class A184352 extends A184348 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(6, mN);
  }
}

