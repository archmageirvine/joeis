package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000959;

/**
 * A032639 Lucky numbers indexed by the lucky numbers (Lucky numbers with lucky number subscripts).
 * @author Sean A. Irvine
 */
public class A032639 extends A000959 {

  private final Sequence mLucky = new A000959();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z l = mLucky.next();
    Z p;
    do {
      p = super.next();
      mN = mN.add(1);
    } while (mN.compareTo(l) < 0);
    return p;
  }
}
