package irvine.oeis.a163;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A163509 Take n written in binary. Replace the leftmost run of 1's with just a single 1. a(n) is the decimal equivalent of the result.
 * @author Georg Fischer
 */
public class A163509 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return new Z(Z.valueOf(++mN).toString(2).replaceAll("\\A1+", "1"), 2);
  }
}
