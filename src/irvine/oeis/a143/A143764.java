package irvine.oeis.a143;
// manually cordrec at 2022-06-09 19:34

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A143764 a(n+1) = (a(n)+n)^2, a(1) = 1.
 * @author Georg Fischer
 */
public class A143764 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A143764() {
    super(1, 1, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n).add(n).square();
  }
}
