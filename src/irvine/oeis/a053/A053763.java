package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053763 a(n) = 2^(n^2 - n).
 * @author Sean A. Irvine
 */
public class A053763 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN * mN - mN);
  }
}
