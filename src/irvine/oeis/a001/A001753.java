package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001753 Expansion of 1/((1+x)*(1-x)^6).
 * @author Sean A. Irvine
 */
public class A001753 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(4).add(70).multiply(mN).add(460).multiply(mN).add(1400).multiply(mN).add(1936).multiply(mN).divide(960).add(1);
  }
}
