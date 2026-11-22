package irvine.oeis.a341;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000085;

/**
 * A341502 Number of matchings in the 3 X n rook graph.
 * @author Gregory Morse
 */
public class A341502 extends Sequence0 {
  // After Andrew Howroyd.
  private final DirectSequence mInvolutions = DirectSequence.create(new A000085());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int i = 0; i <= mN; ++i) {
      for (int j = 0; j <= mN - i; ++j) {
        final Z row = Binomial.binomial(mN, i).multiply(Binomial.binomial(mN - i, j)).multiply(mInvolutions.a(mN - i - j));
        for (int k = 0; k <= mN - i - j; ++k) {
          sum = sum.add(row.multiply(Binomial.binomial(mN - i - j, k)).multiply(mInvolutions.a(mN - i - k)).multiply(mInvolutions.a(mN - j - k)));
        }
      }
    }
    return sum;
  }
}
