package irvine.oeis.a039;
// manually partran at 2022-10-03

import irvine.math.z.Z;
import irvine.oeis.a000.A000027;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A039598 Triangle formed from odd-numbered columns of triangle of expansions of powers of x in terms of Chebyshev polynomials U_n(x). Sometimes called Catalan's triangle.
 * Sometimes called Catalan's triangle.
 * @author Georg Fischer
 */
public class A039598 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A039598() {
    super(0, new A000027(), true, false);
  }

  @Override
  public Z next() {
    return super.next().abs();
  }
}
