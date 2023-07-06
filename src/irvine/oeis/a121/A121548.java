package irvine.oeis.a121;
// manually partran at 2022-10-18 05:00

import irvine.oeis.a010.A010056;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A121548 Triangle read by rows: T(n,k) is the number of compositions of n into k Fibonacci numbers (1 &lt;= k &lt;= n; only one 1 is considered as a Fibonacci number).
 * @author Georg Fischer
 */
public class A121548 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A121548() {
    super(1, new A010056().skip(1));
  }
}
