package irvine.oeis.a191;
// manually cordrec at 2022-06-09 19:34

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A191864 a(n) = (a(n-1) + a(n-4)) * (a(n-2) - a(n-3)) with a(1)=1, a(2)=2, a(3)=3 and a(4)=4.
 * @author Georg Fischer
 */
public class A191864 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A191864() {
    super(1, 4, 0, 1, 2, 3, 4);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).add(a(n - 4)).multiply(a(n - 2).subtract(a(n - 3)));
  }
}
