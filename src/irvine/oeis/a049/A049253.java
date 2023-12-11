package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;

/**
 * A049253 Smallest nonnegative value taken on by 14x^2 - ny^2 for an infinite number of integer pairs (x, y).
 * @author Sean A. Irvine
 */
public class A049253 extends A049239 implements Conjectural {

  // The HEURISTIC below is not large enough for some values!

  private static final long HEURISTIC = 1000;

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(f(14, ++mN, HEURISTIC * mN));
  }
}
