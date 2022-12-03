package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a055.A055661;

/**
 * A060575 Tower of Hanoi: using the optimal way to move an even number of disks from peg 0 to peg 2 or an odd number from peg 0 to peg 1, a(n) is the smallest disk on peg 2 after n moves (or 0 if there are no disks on peg 2).
 * @author Sean A. Irvine
 */
public class A060575 extends A055661 {

  @Override
  public Z next() {
    Z t = super.next();
    long k = 1;
    while (!t.isZero()) {
      if (t.mod(3) == 2) {
        return Z.valueOf(k);
      }
      t = t.divide(3);
      ++k;
    }
    return Z.ZERO;
  }
}
