package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014964 a(n) = lcm(n, 2^(n-1)).
 * @author Sean A. Irvine
 */
public class A014964 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mN++).lcm(Z.valueOf(mN));
  }
}
