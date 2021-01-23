package irvine.oeis.a255;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A255270 Integer part of fourth root of n.
 * @author Sean A. Irvine
 */
public class A255270 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.root(4);
  }
}
