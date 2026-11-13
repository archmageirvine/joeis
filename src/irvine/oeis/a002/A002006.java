package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002006 Number of rooted planar maps with 2n trivalent vertices and a root vertex of valence 4.
 * @author Sean A. Irvine
 */
public class A002006 extends A002005 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t.multiply2());
  }
}
