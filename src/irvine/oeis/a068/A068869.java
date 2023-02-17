package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A068869 Smallest number k such that n! + k is a square.
 * @author Sean A. Irvine
 */
public class A068869 extends A000142 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    final Z f = super.next();
    if (Z.ONE.equals(f)) {
      return Z.ZERO;
    }
    final Z s = f.sqrt().add(1).square();
    return s.subtract(f);
  }
}

