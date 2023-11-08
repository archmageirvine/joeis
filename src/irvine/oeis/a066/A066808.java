package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066808.
 * @author Sean A. Irvine
 */
public class A066808 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z mod = Z.ONE.shiftLeft(++mN).add(1);
    return Z.TWO.modPow(Z.ONE.shiftLeft(mN), mod);
  }
}

