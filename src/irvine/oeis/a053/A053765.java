package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053765 a(n) = 4^(n^2 - n).
 * @author Sean A. Irvine
 */
public class A053765 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(2 * (++mN * mN - mN));
  }
}
