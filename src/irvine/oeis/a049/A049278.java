package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;

/**
 * A049278 Smallest nonnegative value taken on by nx^2 - 19y^2 for an infinite number of integer pairs (x, y).
 * @author Sean A. Irvine
 */
public class A049278 extends A049239 implements Conjectural {

  // The HEURISTIC below is not large enough for some values!

  private static final long HEURISTIC = 5000;

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(f(++mN, 19, HEURISTIC * mN));
  }
}
