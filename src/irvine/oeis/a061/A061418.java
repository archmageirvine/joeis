package irvine.oeis.a061;
// manually cordrec at 2022-06-09 19:34

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A061418 a(n) = floor(a(n-1)*3/2) with a(1) = 2.
 * @author Georg Fischer
 */
public class A061418 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A061418() {
    super(1, 1, 0, 2);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(3).divide(2);
  }
}
