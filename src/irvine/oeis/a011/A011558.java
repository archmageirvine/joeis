package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011558 Expansion of (x + x^3)/(1 + x + ... + x^4) mod 2.
 * @author Sean A. Irvine
 */
public class A011558 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(4).mod(Z.FIVE);
  }
}
