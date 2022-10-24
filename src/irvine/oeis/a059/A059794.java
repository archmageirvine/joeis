package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A059794 a(n) = n* - 2^(n-1), where n* (A003418) = least common multiple of the numbers [1,...,n].
 * @author Georg Fischer
 */
public class A059794 extends A003418 {

  private Z mPow2 = Z.ONE;

  /** Construct the sequence. */
  public A059794() {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    final Z result = super.next().subtract(mPow2);
    mPow2 = mPow2.multiply2();
    return result;
  }
}
