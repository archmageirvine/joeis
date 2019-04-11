package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017555 <code>(12n+2)^11</code>.
 * @author Sean A. Irvine
 */
public class A017555 implements Sequence {

  private Z mN = Z.valueOf(-10);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(11);
  }
}

