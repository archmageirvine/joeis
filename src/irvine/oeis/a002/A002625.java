package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002625.
 * @author Sean A. Irvine
 */
public class A002625 implements Sequence {

  private static final Z Z135 = Z.valueOf(135);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(6).add(144).multiply(mN).add(1256).multiply(mN).add(4744).multiply(mN).add(6785).signedAdd(mN.isEven(), Z135).multiply(mN.add(1)).add(8639).divide(8640);
  }
}
