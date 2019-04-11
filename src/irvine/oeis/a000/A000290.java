package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000290 The squares: <code>a(n) = n^2</code>.
 * @author Sean A. Irvine
 */
public class A000290 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square();
  }
}
