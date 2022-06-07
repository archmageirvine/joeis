package irvine.oeis.a176;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A176595 a(n) = 11^(2^n).
 * @author Georg Fischer
 */
public class A176595 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(11).pow(Z.ONE.shiftLeft(++mN));
  }
}
