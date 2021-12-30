package irvine.oeis.a097;
// manually A055628/parm2 at 2021-12-30 14:18

import irvine.math.z.Z;
import irvine.oeis.a055.A055628;

/**
 * A097443 Half-period primes, i.e., primes p for which the decimal expansion of 1/p has period (p-1)/2.
 * @author Georg Fischer
 */
public class A097443 extends A055628 {

  private int mN;

  /** Construct the sequence. */
  public A097443() {
    super(2);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.THREE;
    }
    return super.next();
  }
}
