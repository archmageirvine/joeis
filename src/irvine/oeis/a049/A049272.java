package irvine.oeis.a049;

import irvine.oeis.Conjectural;
import irvine.math.z.Z;

/**
 * A049272 Smallest nonnegative value taken on by nx^2 - 13y^2 for an infinite number of integer pairs (x, y).
 * @author Sean A. Irvine
 */
public class A049272 extends A049239 implements Conjectural {

  // The HEURISTIC below is not large enough for some values!

  private static final long HEURISTIC = 1000;

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(f(++mN, 13, HEURISTIC * mN));
  }
}
