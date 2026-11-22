package irvine.oeis.a333;

import irvine.math.z.Z;
import irvine.oeis.a087.A087117;

/**
 * A333766 Maximum part of the n-th composition in standard order. a(0) = 0.
 * @author Gregory Morse
 */
public class A333766 extends A087117 {
  private boolean mFirst = true;

  @Override
  public Z next() {
    final Z zeros = super.next();
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return zeros.add(1);
  }
}
