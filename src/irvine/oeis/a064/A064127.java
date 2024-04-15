package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A064127 Number of divisors of 11^n - 1 that are relatively prime to 11^m - 1 for all 0 &lt; m &lt; n.
 * @author Sean A. Irvine
 */
public class A064127 extends A064079 {

  /** Construct the sequence. */
  public A064127() {
    super(11);
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}
