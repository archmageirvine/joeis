package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;

/**
 * A049265 Smallest nonnegative value taken on by n*x^2 - 6*y^2 for an infinite number of integer pairs (x, y).
 * @author Sean A. Irvine
 */
public class A049265 extends A049239 implements Conjectural {

  // The HEURISTIC below is not large enough for some values!

  private static final long HEURISTIC = 1000;

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(f(++mN, 6, HEURISTIC * mN));
  }
}
