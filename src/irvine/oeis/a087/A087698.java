package irvine.oeis.a087;
// manually rio at 2021-10-28

import irvine.math.z.Z;
import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A087698 Triangle read by rows, giving T(n,k) = maximum number of examples (Boolean inputs) at Hamming distance 2 for symmetric Boolean functions that can have different outputs.
 *
 * @author Georg Fischer
 */
public class A087698 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A087698() {
    super(0, new long[] {1, -3, 0, 4, 0, 0, -2, 0, 0, 0}, new long[] {1, -2, -1, 1, 1, 0, 0, 0, 0, 0});
  }

  @Override
  public Z next() {
    return super.next().abs();
  }
}
