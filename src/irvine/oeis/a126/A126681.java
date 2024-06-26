package irvine.oeis.a126;
// Generated by gen_seq4.pl prodsim/prodsi at 2022-04-14 16:07

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A126681 a(n) = Product_{i=5..n} Stirling_2(i,5).
 * @author Georg Fischer
 */
public class A126681 extends AbstractSequence {

  /** Construct the sequence. */
  public A126681() {
    super(5);
  }

  private int mN = 4;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int i = 5; i <= mN; ++i) {
      prod = prod.multiply(Functions.STIRLING2.z(i, 5));
    }
    return prod;
  }
}
