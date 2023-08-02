package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053765 a(n) = 4^(n^2 - n).
 * @author Sean A. Irvine
 */
public class A053765 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(2 * ((long) ++mN * mN - mN));
  }
}
