package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000799 a(n) = floor(2^n / n).
 * @author Sean A. Irvine
 */
public class A000799 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).divide(mN);
  }
}
