package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004305 Simple triangulations of a disk: column 4 of square array in A210664.
 * @author Sean A. Irvine
 */
public class A004305 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(15).multiply(mN).add(103).multiply(mN).add(405).multiply(mN).add(976).multiply(mN).add(1236).multiply(mN).add(432).divide(144);
  }
}

