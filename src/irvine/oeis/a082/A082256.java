package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082256 (Concatenation of 9n-8, 9n-7, 9n-6, 9n-5, 9n-4, 9n-3, 9n-2, 9n-1 and 9n) divided by 9.
 * @author Georg Fischer
 */
public class A082256 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return new Z(String.valueOf(9 * mN - 8) + String.valueOf(9 * mN - 7) + String.valueOf(9 * mN - 6) + String.valueOf(9 * mN - 5) + String.valueOf(9 * mN - 4) + String.valueOf(9 * mN - 3) + String.valueOf(9 * mN - 2) + String.valueOf(9 * mN - 1) + String.valueOf(9 * mN)).divide(9);
  }
}
