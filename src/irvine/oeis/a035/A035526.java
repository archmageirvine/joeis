package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035526 Reverse and add (in binary).
 * @author Sean A. Irvine
 */
public class A035526 extends A035342 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.add(new Z(new StringBuilder(mN.toString(2)).reverse(), 2));
    return new Z(mN.toString(2));
  }
}

