package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a005.A005574;

/**
 * A059793 Stationary value of quotient in the continued fraction expansion of sqrt(prime) when the quotient-cycle-length = 1.
 * @author Sean A. Irvine
 */
public class A059793 extends A005574 {

  /** Construct the sequence. */
  public A059793() {
    super(0);
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
