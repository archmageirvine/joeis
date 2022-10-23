package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055510 Largest odd prime in sequence obtained in 3x+1 (or Collatz) problem starting at n, or 0 if no such prime is found.
 * @author Sean A. Irvine
 */
public class A055510 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z max = Z.ZERO;
    Z m = mN.makeOdd();
    while (!Z.ONE.equals(m)) {
      if (m.isProbablePrime()) {
        max = max.max(m);
      }
      m = m.multiply(3).add(1).makeOdd();
    }
    return max;
  }
}
