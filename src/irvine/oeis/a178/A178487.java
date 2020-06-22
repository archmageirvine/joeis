package irvine.oeis.a178;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A178487 <code>a(n) = floor(n^(1/5))</code>: integer part of fifth root of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A178487 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.root(5);
  }
}
