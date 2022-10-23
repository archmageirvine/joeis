package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005014 Certain subgraphs of a directed graph (inverse binomial transform of A005321).
 * @author Sean A. Irvine
 */
public class A005014 extends Sequence1 {

  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;
  private boolean mS = false;

  @Override
  public Z next() {
    mT = mT.multiply2();
    mS = !mS;
    mA = mA.multiply(mT.subtract(2)).signedAdd(mS, Z.ONE);
    return mA;
  }

}

