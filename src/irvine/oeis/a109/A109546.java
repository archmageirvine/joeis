package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A109546 (4^(n+1)-(-1)^n 9 )/5.
 * @author Georg Fischer
 */
public class A109546 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(2 * (mN + 1)).subtract(((mN & 1) == 0) ? 9 : -9).divide(5);
  }
}
