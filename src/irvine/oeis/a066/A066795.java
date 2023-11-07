package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066795 Inverted decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A066795 extends Sequence1 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    final CR x = CR.PI.multiply(mT);
    return CR.HALF.subtract(x).add(x.floor()).inverse().floor();
  }
}

