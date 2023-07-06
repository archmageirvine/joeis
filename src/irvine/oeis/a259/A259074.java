package irvine.oeis.a259;
// manually partran at 2022-10-17 11:53

import irvine.oeis.a003.A003269;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A259074 Triangle T(n,k) = Sum_{j=0..(n-k)/3} C(n-3*j-1,k-1)*C(n-k-3*j,j).
 * @author Georg Fischer
 */
public class A259074 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A259074() {
    super(1, new A003269().skip(1));
  }
}
