package irvine.oeis.a214;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A214269 Number A(n,k) of compositions of n where the difference between largest and smallest parts is &lt;= k
 * and adjacent parts are unequal; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A214268 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A214268() {
    super(0, 0, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return A214269.A.get(n, k);
  }
}
