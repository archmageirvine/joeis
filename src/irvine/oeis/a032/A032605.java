package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000959;

/**
 * A032605 Prime numbers indexed by lucky numbers.
 * @author Sean A. Irvine
 */
public class A032605 extends A000040 {

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
