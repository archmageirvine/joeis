package irvine.oeis.a049;

import irvine.oeis.Conjectural;
import irvine.math.z.Z;

/**
 * A049262 Smallest nonnegative value taken on by nx^2 - 3y^2 for an infinite number of integer pairs (x, y).
 * @author Sean A. Irvine
 */
public class A049262 extends A049239 implements Conjectural {

  // The HEURISTIC below is not large enough for some values!

  private static final long HEURISTIC = 1000;

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(f(++mN, 3, HEURISTIC * mN));
  }
}
