package irvine.oeis.a261;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A261125 a(n) = (2^(n-1))!*a(n-1), a(1)=1.
 * @author Georg Fischer
 */
public class A261125 extends Sequence1 {

  private int mN;
  private Z mA;

  /** Construct the sequence. */
  public A261125() {
    mN = 0;
    mA = Z.ONE;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.ONE;
    }
    mA = mA.multiply(MemoryFactorial.SINGLETON.factorial(Z.ONE.shiftLeft(mN - 1)));
    return mA;
  }
}
