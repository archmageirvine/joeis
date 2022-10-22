package irvine.oeis.a065;
// manually partrapl/partran at 2022-10-20 14:23

import irvine.oeis.a000.A000957;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A065600 Triangle T(n,k) giving number of Dyck paths of length 2n with exactly k hills (0 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A065600 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A065600() {
    super(0, new A000957(), 1);
  }
}
