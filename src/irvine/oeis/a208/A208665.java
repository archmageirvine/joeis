package irvine.oeis.a208;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A208665 Numbers that match odd ternary polynomials; see Comments.
 * <code>a(n) = 3*fromdigits(digits(n, 3), 9)</code>.
 * @author Georg Fischer
 */
public class A208665 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return new Z(Integer.toString(mN, 3), 9).multiply(3);
  }
}
