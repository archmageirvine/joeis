package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000212 <code>a(n) = floor(n^2/3)</code>.
 * @author Sean A. Irvine
 */
public class A000212 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().divide(3);
  }
}

