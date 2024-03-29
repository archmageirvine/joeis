package irvine.oeis.a346;
// Generated by gen_seq4.pl build/arronk

import irvine.math.z.Z;

/**
 * A346882 Number of partitions of the (n+5)-multiset {1,2,...,n,1,2,...,5}.
 * @author Georg Fischer
 */
public class A346882 extends A346500 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, 5);
  }
}

