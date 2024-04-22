package irvine.oeis.a221;
// manually convol/convprod at 2023-07-10 09:57

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A221529 Triangle read by rows: T(n,k) = A000203(k)*A000041(n-k), 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A221529 extends BaseTriangle {

  /** Construct the sequence. */
  public A221529() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Functions.SIGMA.z(k).multiply(Functions.PARTITIONS.z(n - k));
  }
}
