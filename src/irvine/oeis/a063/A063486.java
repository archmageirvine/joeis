package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063486 a(n) = 2^(2^n) + 5.
 * @author Georg Fischer
 */
public class A063486 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(1L << mN).add(5);
  }
}
