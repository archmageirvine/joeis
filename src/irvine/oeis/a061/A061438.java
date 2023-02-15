package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061438 Number of steps for trajectory of n to reach 1 under the map that sends x -&gt; x/13 if x mod 13 = 0, x -&gt; 14x+13-(x mod 13) if x is not 0 mod 13 (for a 2nd time when n starts at 1).
 * @author Sean A. Irvine
 */
public class A061438 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long steps = 0;
    do {
      ++steps;
      t = t.mod(13) == 0 ? t.divide(13) : t.multiply(14).add(13 - t.mod(13));
    } while (!Z.ONE.equals(t));
    return Z.valueOf(steps);
  }
}

