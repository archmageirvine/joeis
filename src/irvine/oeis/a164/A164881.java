package irvine.oeis.a164;
// manually inverse at 2023-07-24 10:20

import irvine.math.z.Z;
import irvine.oeis.a011.A011557;
import irvine.oeis.triangle.WrappedRecurrence;

/**
 * A164881 Inverse of A164844
 * @author Georg Fischer
 */
public class A164881 extends WrappedRecurrence {

  /** Construct the sequence. */
  public A164881() {
    super(1, new A011557(), "1");
  }

  @Override
  protected Z compute(final int n, final int k) {
    final Z result;
    if (k < 0 || k > n) { // outside, for safety only
      result = Z.ZERO;
    } else if (k == 0 || k == n) {
      result = get(n, k); // borders were already set in addRow
    } else {
      result = get(n - 1, k - 1).subtract(get(n - 1, k)); // Pascal's rule
    }
    return result;
  }

}
