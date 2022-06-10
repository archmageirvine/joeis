package irvine.oeis.a309;
// manually cordrec at 2022-06-09 19:34

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A309110 Number of possible permutations of a Pyraminx of size n, including the trivial rotation of the tips.
 * <code>a(n) = 272097792 * 369600^(2*n-6) * a(n-3)</code>
 * @author Georg Fischer
 */
public class A309110 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A309110() {
    super(1, 3, 0, "1, 81, 75582720, 217225462874112000, 19228688422470957567836160000000");
  }

  @Override
  protected Z compute(final int n) {
    return Z.valueOf(369600).pow(2 * n - 6).multiply(272097792L).multiply(a(n - 3));
  }
}
