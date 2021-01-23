package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A010926 Binomial coefficients C(10,n).
 * @author Sean A. Irvine
 */
public class A010926 extends FiniteSequence {

  private static Z[] buildRow(final int row) {
    final Z[] res = new Z[row + 1];
    for (int k = 0; k <= row / 2; ++k) {
      res[k] = Binomial.binomial(row, k);
      res[row - k] = res[k];
    }
    return res;
  }

  protected A010926(final int row) {
    super(buildRow(row));
  }

  /** Construct the sequence. */
  public A010926() {
    this(10);
  }
}
