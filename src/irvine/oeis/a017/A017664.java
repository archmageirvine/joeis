package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017664 <code>(12n+11)^12</code>.
 * @author Sean A. Irvine
 */
public class A017664 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(12);
  }
}

