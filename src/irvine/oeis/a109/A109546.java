package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A109546 (4^(n+1)-(-1)^n 9 )/5.
 * @author Georg Fischer
 */
public class A109546 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(2L * (mN + 1)).subtract(((mN & 1) == 0) ? 9 : -9).divide(5);
  }
}
