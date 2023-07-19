package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A059926 Length of period of the continued fraction expansion of sqrt(2^n+1).
 * @author Sean A. Irvine
 */
public class A059926 extends A003285 {

  /** Construct the sequence. */
  public A059926() {
    super(4);
  }

  private int mN = 3;

  @Override
  public Z next() {
    return period(Z.ONE.shiftLeft(++mN).add(1));
  }
}
