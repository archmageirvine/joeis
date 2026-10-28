package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087084 Number of integer elements in the subsets of the subsets of the integers 1 to n.
 * @author Sean A. Irvine
 */
public class A087084 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN <= 1 ? Z.ZERO : Z.valueOf(mN - 1).shiftLeft(mN - 3 + (1L << (mN - 1)));
  }
}

