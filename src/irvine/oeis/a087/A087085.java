package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087085 Sum of the integer elements in the subsets of the subsets of the integers 1 to n.
 * @author Sean A. Irvine
 */
public class A087085 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN <= 1 ? Z.ZERO : Z.valueOf(mN * (mN - 1)).shiftLeft(mN - 4 + (1L << (mN - 1)));
  }
}

