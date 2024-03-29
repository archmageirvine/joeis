package irvine.oeis.a346;
// Generated by gen_seq4.pl build/arronk

import irvine.math.z.Z;

/**
 * A346851 Number of partitions of the (n+5)-multiset {0,...,0,1,2,...,n} with five 0's.
 * @author Georg Fischer
 */
public class A346851 extends A346426 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(5, mN);
  }
}

