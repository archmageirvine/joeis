package irvine.oeis.a049;

import irvine.oeis.Conjectural;
import irvine.math.z.Z;

/**
 * A049245 Smallest nonnegative value taken on by 6x^2 - ny^2 for an infinite number of integer pairs (x, y).
 * @author Sean A. Irvine
 */
public class A049245 extends A049239 implements Conjectural {

  // The HEURISTIC below is not large enough for some values!

  private static final long HEURISTIC = 1000;

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(f(6, ++mN, HEURISTIC * mN));
  }
}
