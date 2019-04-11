package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017640 <code>(12n+9)^12</code>.
 * @author Sean A. Irvine
 */
public class A017640 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(12);
  }
}

