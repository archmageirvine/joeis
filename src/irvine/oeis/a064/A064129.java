package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A064129 Number of divisors of 12^n - 1 that are relatively prime to 12^m - 1 for all 0 &lt; m &lt; n.
 * @author Sean A. Irvine
 */
public class A064129 extends A064079 {

  /** Construct the sequence. */
  public A064129() {
    super(12);
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}
