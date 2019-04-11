package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017568 <code>(12n+3)^12</code>.
 * @author Sean A. Irvine
 */
public class A017568 implements Sequence {

  private Z mN = Z.valueOf(-9);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(12);
  }
}

