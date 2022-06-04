package irvine.oeis.a144;

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;
/**
 * A144788 a(n+1) = a(n)^3 - a(n) + 1 with a(1) = 3.
 * @author Georg Fischer
 */
public class A144788 extends ConstantOrderRecurrence {

  /** Construct the sequence. */
  public A144788() {
    super(1, 1, 1, 3);
  }

  @Override
  protected Z compute(final int n) {
    return a(n).pow(3).subtract(a(n)).add(1);
  }
}
