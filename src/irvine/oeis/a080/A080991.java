package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080991 Ratios of successive terms of A080989.
 * @author Sean A. Irvine
 */
public class A080991 extends A080989 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}

