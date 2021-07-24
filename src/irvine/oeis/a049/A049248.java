package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049248 Smallest nonnegative value taken on by 9x^2 - ny^2 for an infinite number of integer pairs (x, y).
 * @author Sean A. Irvine
 */
public class A049248 extends A049239 {

  // WARNING: DO NOT USE THIS TO EXTEND THE SEQUENCE
  // The HEURISTIC below is not large enough for some values!

  private static final long HEURISTIC = 1000;

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(f(9, ++mN, HEURISTIC * mN));
  }
}
