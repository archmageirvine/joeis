package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046051.
 * @author Sean A. Irvine
 */
public class A046051 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    return Z.valueOf(Jaguar.factor(Z.ONE.shiftLeft(mN).subtract(1)).bigOmega());
  }
}

