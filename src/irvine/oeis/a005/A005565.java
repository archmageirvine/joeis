package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005565 Number of walks on square lattice.
 * @author Sean A. Irvine
 */
public class A005565 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(14).multiply(mN).add(69).multiply(mN).add(136).multiply(mN).add(80).divide(4);
  }
}

