package irvine.oeis.a112;
// manually 2022-08-26

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A112373 a(n+2) = (a(n+1)^3 + a(n+1)^2)/a(n) with a(0)=1, a(1)=1.
 * @author Georg Fischer
 */
public class A112373 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A112373() {
    super(0, 2, 2, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n + 1).pow(3).add(a(n + 1).square()).divide(a(n));
  }
}
