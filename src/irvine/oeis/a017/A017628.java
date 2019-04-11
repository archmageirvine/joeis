package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017628 <code>(12n+8)^12</code>.
 * @author Sean A. Irvine
 */
public class A017628 implements Sequence {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(12);
  }
}

