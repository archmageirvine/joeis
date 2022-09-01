package irvine.oeis.a262;
// manually at 2022-09-01

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A262088 a(0)=0, a(1)=1, a(n) = -a(n-2)^2 - a(n-1)^3.
 * @author Georg Fischer
 */
public class A262088 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A262088() {
    super(0, 2, 0, 0, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 2).square().add(a(n - 1).pow(3)).negate();
  }
}
