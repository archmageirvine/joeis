package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060547 a(n) = 2^(floor(n/3) + ((n mod 3) mod 2)).
 * @author Sean A. Irvine
 */
public class A060547 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN / 3 + ((mN % 3) & 1));
  }
}
