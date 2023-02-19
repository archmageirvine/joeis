package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061495 a(n) = lcm(3n+1, 3n+2, 3n+3).
 * @author Sean A. Irvine
 */
public class A061495 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).lcm(Z.valueOf(++mN)).lcm(Z.valueOf(++mN));
  }
}

