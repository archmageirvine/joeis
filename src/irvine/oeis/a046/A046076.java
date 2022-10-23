package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046076 Indices of binary undulants; numbers n such that 2^n contains the alternating sequence of digits 010... or 101...
 * @author Sean A. Irvine
 */
public class A046076 extends Sequence1 {

  private static final Z Z100 = Z.valueOf(100);
  private int mN = 102;
  private Z mA = Z.ONE.shiftLeft(mN);

  private boolean is(Z n) {
    while (n.compareTo(Z100) > 0) {
      final long r = n.mod(1000);
      if (r == 10 || r == 101) {
        return true;
      }
      n = n.divide(10);
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply2();
      if (is(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}
