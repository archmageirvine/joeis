package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000982 <code>a(n) = ceiling(n^2/2)</code>.
 * @author Sean A. Irvine
 */
public class A000982 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(1).divide(2);
  }
}

