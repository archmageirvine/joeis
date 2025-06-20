package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a382.A382684;

/**
 * A084277 Pseudo-random numbers: Davenport's generator for 32-bit integers.
 * @author Sean A. Irvine
 */
public class A084277 extends A382684 {

  private static final Z MASK = Z.valueOf(0x7FFF);
  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    return super.next().shiftRight(16).and(MASK);
  }
}
