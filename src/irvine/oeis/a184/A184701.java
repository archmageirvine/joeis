package irvine.oeis.a184;
// Generated by gen_seq4.pl A183953/arronk

import irvine.math.z.Z;

/**
 * A184701 Number of strings of numbers x(i=1..n) in 0..7 with sum i*x(i) equal to n*7.
 * @author Georg Fischer
 */
public class A184701 extends A184703 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, 7);
  }
}

