package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061436 Number of steps for trajectory of n to reach 1 under the map that sends x -&gt; x/3 if x mod 3 = 0, x -&gt; x+3-(x mod 3) if x is not 0 mod 3 (for a 2nd time when n starts at 1).
 * @author Sean A. Irvine
 */
public class A061436 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long t = ++mN;
    long steps = 0;
    do {
      ++steps;
      t = t % 3 == 0 ? t / 3 : t + 3 - t % 3;
    } while (t != 1);
    return Z.valueOf(steps);
  }
}

