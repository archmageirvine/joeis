package irvine.oeis.a320;

import irvine.oeis.a291.A291292;
import irvine.oeis.triangle.PartitionTransformTriangle;
import irvine.oeis.triangle.Transpose;

/**
 * A320902 Expansion of ogf(x, t) = u / (6*x - t*x*u - 2) with u = x*(2*x - 2*y + 8) + y - 3 and y = sqrt(1 - 4*x). Triangle read by rows: T(n, k) with 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A320902 extends Transpose {

  /** Construct the sequence. */
  public A320902() {
    super(new PartitionTransformTriangle(0, new A291292()));
  }
}
