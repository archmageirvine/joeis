package irvine.oeis.a049;

import irvine.oeis.Conjectural;
import irvine.math.z.Z;

/**
 * A049241 Smallest nonnegative value taken on by 2*x^2 - n*y^2 for an infinite number of integer pairs (x, y).
 * @author Sean A. Irvine
 */
public class A049241 extends A049239 implements Conjectural {


  private static final long HEURISTIC = 1000;

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(f(2, ++mN, HEURISTIC * mN));
  }
}
