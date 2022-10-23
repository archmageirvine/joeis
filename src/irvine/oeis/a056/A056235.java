package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056235 n*2^(n*2^n+n)-1.
 * @author Georg Fischer
 */
public class A056235 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(Z.ONE.shiftLeft(mN).multiply(mN).add(mN).intValue()).multiply(mN).subtract(1);
  }
}
