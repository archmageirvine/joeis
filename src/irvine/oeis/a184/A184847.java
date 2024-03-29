package irvine.oeis.a184;
// Generated by gen_seq4.pl A183953/arronk

import irvine.math.z.Z;

/**
 * A184847 Number of strings of numbers x(i=1..n) in 0..8 with sum i*x(i)^4 equal to n*4096.
 * @author Georg Fischer
 */
public class A184847 extends A184848 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, 8);
  }
}

