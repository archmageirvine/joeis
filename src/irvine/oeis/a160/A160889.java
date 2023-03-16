package irvine.oeis.a160;
// manually

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a059.A059376;

/**
 * A160889 a(n) = Sum_{d|n} Moebius(n/d)*d^(b-1)/phi(n) for b = 4.
 * a(n) = J_3(n)/J_1(n)=J_3(n)/phi(n)=A059376(n)/A000010(n)
 * @author Georg Fischer
 */
public class A160889 extends A059376 {

  /** Construct the sequence. */
  public A160889() {
    this(4);
  }

  /**
   * Generic constructor with parameter 
   * @param b exponent of Jordan function + 1
   */
  public A160889(final int b) {
    super(b - 1);
  }

  @Override
  public Z next() {
    return super.next().divide(Euler.phiAsLong(mN));
  }
}
