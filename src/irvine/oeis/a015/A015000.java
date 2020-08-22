package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015000 q-integers for q=-13.
 * @author Sean A. Irvine
 */
public class A015000 implements Sequence {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-13);
    return Z.ONE.subtract(mT).divide(14);
  }
}
