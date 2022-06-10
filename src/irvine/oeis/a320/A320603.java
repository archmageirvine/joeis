package irvine.oeis.a320;
// manually cordrec at 2022-06-08 21:34

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A320603 a(0) = 1; if n is odd, a(n) = Product_{i=0..n-1} a(i); if n is even, a(n) = Sum_{i=0..n-1} a(i).
 * @author Georg Fischer
 */
public class A320603 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A320603() {
    super(0, 2, 0, 1, 1, 2);
  }

  @Override
  protected Z compute(final int n) {
    return ((n & 1) == 0)
      ? a(n - 1).add(a(n - 2).multiply(2))
      : a(n - 1).multiply(a(n - 2).square());
  }
}
