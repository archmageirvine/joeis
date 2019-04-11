package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017064 <code>(7*n+6)^12</code>.
 * @author Sean A. Irvine
 */
public class A017064 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN.pow(12);
  }
}

