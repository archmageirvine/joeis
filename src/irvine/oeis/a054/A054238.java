package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A054238 Array read by downward antidiagonals: T(i,j) = bits of binary expansion of i interleaved with that of j.
 * Example: T(5, 6)=57 because .1.0.1 (5) merged with 1.1.0. (6) is 111001 (57).
 * @author Georg Fischer
 */
public class A054238 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A054238() {
    super(0, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return new Z(Integer.toString(n, 2), 4).shiftLeft(1).add(new Z(Integer.toString(k, 2), 4));
  }
}
