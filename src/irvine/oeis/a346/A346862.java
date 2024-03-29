package irvine.oeis.a346;
// Generated by gen_seq4.pl build/arronk

import irvine.math.z.Z;

/**
 * A346862 Number of partitions of the (n+9)-multiset {0,...,0,1,2,...,9} with n 0's.
 * @author Georg Fischer
 */
public class A346862 extends A346426 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, 9);
  }
}

