package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a055.A055661;

/**
 * A060574 Tower of Hanoi: using the optimal way to move an even number of disks from peg 0 to peg 2 or an odd number from peg 0 to peg 1, a(n) is the smallest disk on peg 1 after n moves (or 0 if there are no disks on peg 1).
 * @author Sean A. Irvine
 */
public class A060574 extends A055661 {

  @Override
  public Z next() {
    Z t = super.next();
    long k = 1;
    while (!t.isZero()) {
      if (t.mod(3) == 1) {
        return Z.valueOf(k);
      }
      t = t.divide(3);
      ++k;
    }
    return Z.ZERO;
  }
}
