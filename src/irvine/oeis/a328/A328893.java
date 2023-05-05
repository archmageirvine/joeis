package irvine.oeis.a328;
// manually partsum at 2023-05-03 22:39

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a095.A095112;

/**
 * A328893 Partial sums of A095112: sum of the Dirichlet convolution of the characteristic function of the prime powers (A069513) with the positive integers (A000027) from 1 to n.
 * @author Georg Fischer
 */
public class A328893 extends PartialSumSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A328893() {
    super(0, new A095112());
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : super.next();
  }
}
