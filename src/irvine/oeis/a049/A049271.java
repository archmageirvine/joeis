package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049271 Smallest nonnegative value taken on by nx^2 - 12y^2 for an infinite number of integer pairs (x, y).
 * @author Sean A. Irvine
 */
public class A049271 extends A049239 {

  // WARNING: DO NOT USE THIS TO EXTEND THE SEQUENCE
  // The HEURISTIC below is not large enough for some values!

  private static final long HEURISTIC = 1000;

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(f(++mN, 12, HEURISTIC * mN));
  }
}
