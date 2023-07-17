package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a050.A050376;

/**
 * A037992 Smallest number with 2^n divisors.
 * @author Sean A. Irvine
 */
public class A037992 extends A050376 {

  /** Construct the sequence. */
  public A037992() {
    super(0);
  }

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(super.next());
    return mA;
  }
}
