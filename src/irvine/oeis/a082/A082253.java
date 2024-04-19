package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082253 Concatenation of (5n-4), (5n-3), (5n-2), (5n-1) and 5n divided by 5.
 * @author Georg Fischer
 */
public class A082253 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return new Z(String.valueOf(5 * mN - 4) + (5 * mN - 3) + (5 * mN - 2) + (5 * mN - 1) + 5 * mN).divide(5);
  }
}
