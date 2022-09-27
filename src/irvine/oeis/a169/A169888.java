package irvine.oeis.a169;

import irvine.math.z.Z;
import irvine.oeis.a145.A145855;

/**
 * A169888 Number of n-member subsets of 1..2n whose elements sum to a multiple of n.
 * @author Georg Fischer
 */
public class A169888 extends A145855 {

  private int mN = -1;

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    return super.next().multiply2();
  }
}
