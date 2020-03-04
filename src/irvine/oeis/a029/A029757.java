package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029757 <code>a(n) = 5^n mod 2^n</code>.
 * @author Sean A. Irvine
 */
public class A029757 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.FIVE.modPow(Z.valueOf(++mN), Z.ONE.shiftLeft(mN));
  }
}
