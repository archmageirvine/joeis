package irvine.oeis.a176;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A176595 a(n) = 11^(2^n).
 * @author Georg Fischer
 */
public class A176595 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(11).pow(Z.ONE.shiftLeft(++mN));
  }
}
