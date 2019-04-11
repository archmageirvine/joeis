package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014591 <code>a(n) = floor(n^2/12 + 5/4)</code>.
 * @author Sean A. Irvine
 */
public class A014591 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(15).divide(12);
  }
}
