package irvine.oeis.a096;
// manually partran at 2022-10-03 20:38

import irvine.oeis.a054.A054341;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A096164 Triangle T(n,m) read by rows: matrix product A053121 * A038207.
 * @author Georg Fischer
 */
public class A096164 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A096164() {
    super(1, new A054341());
  }
}
