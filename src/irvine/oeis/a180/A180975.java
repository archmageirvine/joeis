package irvine.oeis.a180;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A180975 Array of the "egg-drop" numbers, read by downwards antidiagonals.
 * @author Georg Fischer
 */
public class A180975 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A180975() {
    super(1, 1, -1);
    hasRAM(true);
  }

  @Override
  // T(n,k) = Sum_{j=1..k} binomial(n,j).
  public Z matrixElement(final int n, final int k) {
    return Integers.SINGLETON.sum(1, k, j -> Binomial.binomial(n, j));
  }
}
