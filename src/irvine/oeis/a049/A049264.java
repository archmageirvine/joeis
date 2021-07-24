package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049264 Smallest nonnegative value taken on by n*x^2 - 5*y^2 for an infinite number of integer pairs (x, y).
 * @author Sean A. Irvine
 */
public class A049264 extends A049239 {

  // WARNING: DO NOT USE THIS TO EXTEND THE SEQUENCE
  // The HEURISTIC below is not large enough for some values!

  private static final long HEURISTIC = 1000;

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(f(++mN, 5, HEURISTIC * mN));
  }
}
