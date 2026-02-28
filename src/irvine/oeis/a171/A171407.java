package irvine.oeis.a171;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A171407 a(n) = (2^(2^(1+2*n)) + 3) / 7.
 * @author Sean A. Irvine
 */
public class A171407 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(1L << (1 + 2 * ++mN)).add(3).divide(7);
  }
}
