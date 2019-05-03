package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000566 Heptagonal numbers (or <code>7-gonal numbers): n(5n-3)/2</code>.
 * @author Sean A. Irvine
 */
public class A000566 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(5).subtract(3).multiply(mN).divide(2);
  }
}

