package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017411 <code>(11n+1)^11</code>.
 * @author Sean A. Irvine
 */
public class A017411 implements Sequence {

  private Z mN = Z.valueOf(-10);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(11);
  }
}

