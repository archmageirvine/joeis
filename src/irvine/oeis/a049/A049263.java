package irvine.oeis.a049;

import irvine.oeis.Conjectural;
import irvine.math.z.Z;

/**
 * A049263 Smallest nonnegative value taken on by n*x^2 - 4*y^2 for an infinite number of integer pairs (x, y).
 * @author Sean A. Irvine
 */
public class A049263 extends A049239 implements Conjectural {

  // The HEURISTIC below is not large enough for some values!

  private static final long HEURISTIC = 1000;

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(f(++mN, 4, HEURISTIC * mN));
  }
}
