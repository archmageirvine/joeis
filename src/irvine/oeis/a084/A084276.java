package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a385.A385127;

/**
 * A084276 Pseudo-random numbers: gcc 2.6.3 version for 32-bit integers.
 * @author Sean A. Irvine
 */
public class A084276 extends A385127 {

  private static final Z MASK = Z.valueOf(0x7FFF);
  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    return super.next().shiftRight(16).and(MASK);
  }
}
