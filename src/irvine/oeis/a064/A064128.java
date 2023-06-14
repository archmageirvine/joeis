package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A064128 Number of divisors of 6^n - 1 that are relatively prime to 6^m - 1 for all 0 &lt; m &lt; n.
 * @author Sean A. Irvine
 */
public class A064128 extends A064079 {

  /** Construct the sequence. */
  public A064128() {
    super(6);
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
