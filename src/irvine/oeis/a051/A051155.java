package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051152.
 * @author Sean A. Irvine
 */
public class A051155 implements Sequence {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    final Z t = mT;
    mT = mT.multiply(5);
    return Z.ONE.shiftLeft(mT.intValueExact()).subtract(1).divide(Z.ONE.shiftLeft(t.intValue()).subtract(1));
  }
}
