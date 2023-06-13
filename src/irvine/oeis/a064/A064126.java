package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A064126 Number of divisors of 10^n - 1 that are relatively prime to 10^m - 1 for all 0 &lt; m &lt; n.
 * @author Sean A. Irvine
 */
public class A064126 extends A064079 {

  /** Construct the sequence. */
  public A064126() {
    super(10);
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
